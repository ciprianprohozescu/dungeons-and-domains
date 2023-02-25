''' Parser object.
    Parser is the main object of pygold package.
    Parser provides methods to load grammar, open input stream and
    of course, parse.

    Standard parser use looks like this:

    # Initialize parser

    >>> p = pygold.Parser('mygrammar.cgt', 'utf-8')
    >>> p.openFile('myinputfile.txt')

    # Set handlers

    >>> p.onToken = myTokenHandler
    >>> p.onReduction = myReductionHandler

    # Run parser

    >>> result = p.parse()

    # Finalize parser

    >>> p.close()
'''
#-----------------------------------------------------------------------------
# Name:        Parser.py
# Purpose:
# Author:      Milosz A. Krajewski <mkrajewski@user.sourceforge.net>
# Based on:    C# Engine - Marcus Klimstra <klimstra@home.nl>
#              VB Engine - Devin Cook <http://www.devincook.com/goldparser>
# Created:     2004/25/03
# RCS-ID:      $Id: Parser.py $
# Copyright:   (c) 2004
# Licence:     Free for commerical and non-cemmercial use
#              For detailed info read license.txt
#-----------------------------------------------------------------------------
from Symbol import Symbol
from Token import Token
from Rule import Rule
from Reduction import Reduction
from Graph import *
from Action import Action

from TokenStack import TokenStack
from ActionTable import ActionTable

from GrammarReader import GrammarReader
from LookAheadReader import *

from Consts import *
#-----------------------------------------------------------------------------
class Parser:
    ''' Parser object.
    '''
    def __init__(self, filename, encoding = None):
        ''' Constructor. Creates parser for specified grammar.
            Param filename is a filename of compiled grammar table file (.cgt)
            Param encoding is a name of used encoding.
                By default (None) Unicode is assumed which is absolutely not tested :-)
                I've used windows-1250 (yes, I'm from Poland) and utf-8
        '''
        self.encoding = encoding
        self._parameters = {}
        self._symbols = []
        self._charsets = []
        self._rules = []
        self._DFAstates = []
        self._LALRtables = []

        self._initialized = False
        self._casesensitive = False
        self._startsymbol = -1
        self._initDFAstate = -1
        self._errorsymbol = None
        self._endsymbol = None
        self._source = None

        self._linenumber = -1
        self._havereduction = False
        self._trimreductions = False
        self._commentlevel = -1
        self._initLALRstate = -1
        self._LALRstate = -1

        self._inputtokens = TokenStack() ## Stack of tokens to be analyzed
        self._outputtokens = TokenStack() ## The set of tokens for 1. Expecting during error, 2. Reduction
        self._tempstack = TokenStack()

        self.onTokenRead = None
        self.onReduction = None
        self.onLexicalError = None
        self.onSyntaxError = None
        self.onCommentError = None
        self.onInternalError = None

        self.currentToken = None
        self.currentReduction = None

        self.loadTables(filename)
    #-------------------------------------------------------------------------
    def __del__(self):
        ''' Destructor.
            Closes parser.
        '''
        self.close()
    #-------------------------------------------------------------------------
    def getCurrentToken(self):
        ''' Returns current (last read) token.
        '''
        return self._inputtokens.peekToken()
    #-------------------------------------------------------------------------
    def getCurrentReduction(self):
        ''' Returns current (if any) reduction.
        '''
        if self._havereduction:
            return self._tempstack.peekToken().data
        else:
            return None
    #-------------------------------------------------------------------------
    def pushInputToken(self, token):
        ''' Pushes new to token to input stack.
            It can be used for error recorvery after lexical or syntax error.
        '''
        self._inputtokens.pushToken(token)
    #-------------------------------------------------------------------------
    def popInputToken(self):
        ''' Pops token from input stack.
            It can be used for error recorvery after lexical or syntax error.
        '''
        return self._inputtokens.popToken()
    #-------------------------------------------------------------------------
    def getTokens(self):
        ''' Returns output token list.
        '''
        return self._outputtokens
    #-------------------------------------------------------------------------
    def getParameter(self, name):
        ''' Returns value of specified parameter.
            Param name is a paramter name (ie: "Author", "Name", "Version", "About")
        '''
        try:
            return self._parameters[name]
        except KeyError:
            return None
    #-------------------------------------------------------------------------
    def openFile(self, filename):
        ''' Opens specified file as input.
        '''
        self.reset()
        self._source = LookAheadFileReader(file(filename, 'r'))
        self.prepareToParse()
    #-------------------------------------------------------------------------
    def openText(self, text):
        ''' Creates a reader for specified string.
            It can be used for small expressions or whole files
            which are stored in memory anyway.
        '''
        self.reset()
        self._source = LookAheadStringReader(text)
        self.prepareToParse()
    #-------------------------------------------------------------------------
    def openReader(self, reader):
        ''' Opens input stream over specified reader.
            Create your own reader by implementing interface
            specified in LookAheadReader.
        '''
        self.reset()
        self._source = reader
        self.prepareToParse()
    #-------------------------------------------------------------------------
    def close(self):
        ''' Closes input stream.
        '''
        if self._source is not None:
            try: self._source.close()
            except: pass

        self._source = None
    #-------------------------------------------------------------------------
    def parse(self):
        ''' Event handled parse loop.
            Before call of parse method set handler functions:
            + onToken(parser, token):
                method which handles read tokens
            + onReduction(parser, reduction, tokens):
                method which handles processed reductions
            + onSyntaxError(parser),
            + onLexicalError(parser),
            + onCommentError(parser),
            + onInternalError(parser):
                methods which handles errors
                if you handled an error (for example: you pushed additional
                token on input stack) return True from handler function
            Loop is stopped on Accept or unhandled error.
            If text is accepted top reduction.data is returned.
        '''
        done = False
        result = None
        while not done:
            response = self.parseStep()
            if response == EnumParseMessage.TokenRead:
                if self.onToken is not None:
                    self.onToken(self, self.currentToken)
            elif response == EnumParseMessage.Reduction:
                if self.onReduction is not None:
                    self.onReduction(self, self.currentReduction, self.currentReduction.data.tokens)
            elif response == EnumParseMessage.Accept:
                result = self.currentReduction.data
                done = True
            elif response == EnumParseMessage.LexicalError:
                if self.onLexicalError is not None:
                    done = (self.onLexicalError(self) != True)
                else:
                    done = True
            elif response == EnumParseMessage.SyntaxError:
                if self.onSyntaxError is not None:
                    done = (self.onSyntaxError(self) != True)
                else:
                    done = True
            elif response == EnumParseMessage.CommentError:
                if self.onCommentError is not None:
                    done = (self.onCommentError(self) != True)
                else:
                    done = True
            elif response == EnumParseMessage.InternalError:
                if self.onInternalError is not None:
                    done = (self.onInternalError(self) != True)
                else:
                    done = True
        return result
    #-------------------------------------------------------------------------
    def parseStep(self):
        ''' On parser step.
            It is used by alternative way of parsing.
            Instead of use parse() you can use parseStep().

            done = False
            while not done:
                result = parseStep()
                if result == EnumParseMessage.TokenRead:
                    # handle TokenRead
                elif result == EnumParseMessage.Reduction:
                    # handle reduction
                elif result == EnumParseMessage.Accept:
                    # finish parsing
                    done = True
                else:
                    # display error message
                    done = True
                    # --- or ---
                    # try recover from error
                    continue

            Actually, parse() uses parseStep() and passed parser messages
            to handler functions.
        '''
        while True:
            self.currentToken = None
            self.currentReduction = None

            if len(self._inputtokens) == 0:
                ## let's read tokens
                token = self.retrieveToken()
                if token is None:
                    raise ParserError, 'Parser.retrieveToken() returned None'
                if token.kind != EnumSymbolType.Whitespace:
                    self._inputtokens.pushToken(token)
                    if self._commentlevel == 0 and not self.commentToken(token):
                        self.currentToken = token
                        return EnumParseMessage.TokenRead
            elif self._commentlevel > 0:
                ## we are in a block comment
                token = self._inputtokens.popToken()
                if token.kind == EnumSymbolType.CommentStart:
                    self._commentlevel += 1
                elif token.kind == EnumSymbolType.CommentEnd:
                    self._commentlevel -= 1
                elif token.kind == EnumSymbolType.End:
                    return EnumParseMessage.CommentError
            else:
                ## ready to parse
                token = self._inputtokens.peekToken()
                if token.kind == EnumSymbolType.CommentStart:
                    self._inputtokens.popToken()
                    self._commentlevel += 1
                elif token.kind == EnumSymbolType.CommentLine:
                    self._inputtokens.popToken()
                    self.discardLine()
                elif token.kind == EnumSymbolType.Error:
                    return EnumParserMessage.LexicalError
                else:
                    result = self.parseToken(token)
                    if result == EnumParseResult.Accept:
                        self.currentReduction = self._tempstack.peekToken()
                        return EnumParseMessage.Accept
                    elif result == EnumParseResult.InternalError:
                        return EnumParseMessage.InternalError
                    elif result == EnumParseResult.ReduceNormal:
                        self.currentReduction = self._tempstack.peekToken()
                        return EnumParseMessage.Reduction
                    elif result == EnumParseResult.Shift:
                        self._inputtokens.popToken()
                    elif result == EnumParseResult.SyntaxError:
                        return EnumParseMessage.SyntaxError
    #-------------------------------------------------------------------------
##    def fixCase(self, chars):
##        ''' Internal method.
##        '''
##        if self._casesensitive:
##            return chars
##        return string.lower(chars)
    #-------------------------------------------------------------------------
    def __fixCaseTrue(self, chars):
        ''' Internal method.
        '''
        return string.lower(chars)
    #-------------------------------------------------------------------------
    def __fixCaseFalse(self, chars):
        ''' Internal method.
        '''
        return chars
    #-------------------------------------------------------------------------
    def addSymbol(self, symbol):
        ''' Internal method.
        '''
        if not self._initialized:
            raise ParserError, 'Table sizes not initialized'
        self._symbols[symbol.index] = symbol
    #-------------------------------------------------------------------------
    def addCharset(self, index, charset):
        ''' Internal method.
        '''
        if not self._initialized:
            raise ParserError, 'Table sizes not initialized'
        self._charsets[index] = self.fixCase(charset)
    #-------------------------------------------------------------------------
    def addRule(self, rule):
        ''' Internal method.
        '''
        if not self._initialized:
            raise ParserError, 'Table sizes not initialized'
        self._rules[rule.index] = rule
    #-------------------------------------------------------------------------
    def addDFAState(self, index, dfastate):
        ''' Internal method.
        '''
        if not self._initialized:
            raise ParserError, 'Table sizes not initialized'
        self._DFAstates[index] = dfastate
    #-------------------------------------------------------------------------
    def addLALRTable(self, index, table):
        ''' Internal method.
        '''
        if not self._initialized:
            raise ParserError, 'Table sizes not initialized'
        self._LALRtables[index] = table
    #-------------------------------------------------------------------------
    def loadTables(self, filename):
        ''' Internal method.
            Loads CGT file.
        '''
        obj = None
        index = 0
        reader = GrammarReader(filename, self.encoding)

        while reader.moveNext():
            id = reader.retrieveNext()

            if id == EnumRecordId.Parameters:
                self._parameters['Name'] = reader.retrieveNext()
                self._parameters['Version'] = reader.retrieveNext()
                self._parameters['Author'] = reader.retrieveNext()
                self._parameters['About'] = reader.retrieveNext()
                self._casesensitive = reader.retrieveNext()
                self._startsymbol = reader.retrieveNext()

                # set fixCase to adequate function
                if self._casesensitive:
                    self.fixCase = self.__fixCaseFalse
                else:
                    self.fixCase = self.__fixCaseTrue


            elif id == EnumRecordId.TableCounts:
                self._symbols = [None] * reader.retrieveNext()
                self._charsets = [None] * reader.retrieveNext()
                self._rules = [None] * reader.retrieveNext()
                self._DFAstates = [None] * reader.retrieveNext()
                self._LALRtables = [None] * reader.retrieveNext()
                self._initialized = True

            elif id == EnumRecordId.Initial:
                self._initDFAstate = reader.retrieveNext()
                self._initLALRstate = reader.retrieveNext()

            elif id == EnumRecordId.Symbols:
                index = reader.retrieveNext()
                name = reader.retrieveNext()
                kind = reader.retrieveNext()
                self.addSymbol(Symbol(index, name, kind))

            elif id == EnumRecordId.CharSets:
                index = reader.retrieveNext()
                charset = reader.retrieveNext()
                self.addCharset(index, charset)

            elif id == EnumRecordId.Rules:
                index = reader.retrieveNext()
                head = self._symbols[reader.retrieveNext()]
                rule = Rule(index, head)
                reader.retrieveNext() ## reserved

                while True:
                    obj = reader.retrieveNext()
                    if obj is None:
                        break
                    rule.append(self._symbols[obj])
                self.addRule(rule)

            elif id == EnumRecordId.DFAStates:
                state = State()
                index = reader.retrieveNext()
                if reader.retrieveNext():
                    state.accept = reader.retrieveNext()
                else:
                    reader.retrieveNext()
                reader.retrieveNext() ## reserved

                while not reader.retrieveDone():
                    ci = reader.retrieveNext()
                    ti = reader.retrieveNext()
                    reader.retrieveNext() ## reserved
                    state.addEdge(Edge(self._charsets[ci], ti))

                self.addDFAState(index, state)

            elif id == EnumRecordId.LRTables:
                table = ActionTable()
                index = reader.retrieveNext()
                reader.retrieveNext() ## reserved

                while not reader.retrieveDone():
                    sid = reader.retrieveNext()
                    action = reader.retrieveNext()
                    tid = reader.retrieveNext()
                    reader.retrieveNext() ## reserved
                    table.append(Action(self._symbols[sid], action, tid))

                self.addLALRTable(index, table)

            elif id == EnumRecordId.Comment:
                pass ## pass... but it may be written to log or console or something

            else:
                raise ParserError, 'Bad record in CGT file'
    #-------------------------------------------------------------------------
    def reset(self):
        ''' Internal method.
        '''
        for symbol in self._symbols:
            if symbol.kind == EnumSymbolType.Error:
                self._errorsymbol = symbol
            elif symbol.kind == EnumSymbolType.End:
                self._endsymbol = symbol
        self._havereduction = False
        self._LALRstate = self._initLALRstate
        self._linenumber = 1
        self._commentlevel = 0
        self._inputtokens = TokenStack()
        self._outputtokens = TokenStack()
        self._tempstack = TokenStack()
    #-------------------------------------------------------------------------
    def prepareToParse(self):
        ''' Internal method.
        '''
        token = Token()
        token.state = self._initLALRstate
        token.copyData(self._symbols[self._startsymbol])
        self._tempstack.pushToken(token)
    #-------------------------------------------------------------------------
    def discardLine(self):
        ''' Internal method.
        '''
        while True:
            if self._source.read()[0] == '\n':
                break
        self._linenumber += 1
    #-------------------------------------------------------------------------
    def commentToken(self, token):
        ''' Internal method.
        '''
        return (
            (token.kind == EnumSymbolType.CommentLine) or
            (token.kind == EnumSymbolType.CommentStart)
        )
    #-------------------------------------------------------------------------
    def parseToken(self, token):
        ''' Internal method.
        '''
        result = EnumParseResult.InternalError
        table = self._LALRtables[self._LALRstate]
        action = table.getActionForSymbol(token.index)

        if action != None:
            self._havereduction = False
            self._outputtokens.clear()

            if action.action == EnumAction.Accept:
                self._havereduction = True
                result = EnumParseResult.Accept
            elif action.action == EnumAction.Shift:
                token.state = self._LALRstate = action.value
                self._tempstack.pushToken(token)
                result = EnumParseResult.Shift
            elif action.action == EnumAction.Reduce:
                result = self.reduce(self._rules[action.value])
        else:
            ## syntax error - fill expected tokens.
            self._outputtokens.clear()
            for a in table._actionmap.values():
                kind = a.symbol.kind
                if kind == EnumSymbolType.Terminal or kind == EnumSymbolType.End:
                    self._outputtokens.pushToken(Token(a.symbol))
            result = EnumParseResult.SyntaxError

        return result
    #-------------------------------------------------------------------------
    def reduce(self, rule):
        ''' Internal method.
        '''
        result = None
        head = None

        if self._trimreductions and rule.containsNonTerminal():
            ## The current rule only consists of a single nonterminal and can be trimmed from the
            ## parse tree. Usually we create a new Reduction, assign it to the Data property
            ## of Head and push it on the stack. However, in this case, the Data property of the
            ## Head will be assigned the Data property of the reduced token (i.e. the only one
            ## on the stack). In this case, to save code, the value popped of the stack is changed
            ## into the head.
            head = self._tempstack.popToken()
            head.copyData(rule.rule)
            result = EnumParseResult.ReduceEliminated
        else:
            reduction = Reduction()
            reduction.rule = rule
            self._tempstack.popTokensInto(reduction, len(rule))

            head = Token()
            head.data = reduction
            head.copyData(rule.rule)

            self._havereduction = True
            result = EnumParseResult.ReduceNormal

        index = self._tempstack.peekToken().state
        action = self._LALRtables[index].getActionForSymbol(rule.rule.index)

        if action is not None:
            head.state = self._LALRstate = action.value
            self._tempstack.pushToken(head)
        else:
            raise ParserError, 'Action for LALR state is None (LALRtables[%d].getActionForSymbol(%d))' % (index, rule.rule.index)

        return result
    #-------------------------------------------------------------------------
    def retrieveToken(self):
        ''' Internal method.
        '''
        result = None
        currentPos = 0
        lastAcceptState = -1
        lastAcceptPos = -1
        currentState = self._DFAstates[self._initDFAstate]

        try:
            while True:
                ## This code searches all the branches of the current DFA state for the next
                ## character in the input LookaheadStream. If found the target state is returned.
                ## The InStr() function searches the string pCharacterSetTable.Member(CharSetIndex)
                ## starting at position 1 for ch.  The pCompareMode variable determines whether
                ## the search is case sensitive.
                ch = self._source.peek(currentPos)
                if not self._casesensitive: ch = self.fixCase(ch)

                target = currentState.getTargetFor(ch)

                ## This block-if statement checks whether an edge was found from the current state.
                ## If so, the state and current position advance. Otherwise it is time to exit the main loop
                ## and report the token found (if there was it fact one). If the LastAcceptState is -1,
                ## then we never found a match and the Error Token is created. Otherwise, a new token
                ## is created using the Symbol in the Accept State and all the characters that
                ## comprise it.

                if target != -1:
                    ## This code checks whether the target state accepts a token. If so, it sets the
                    ## appropiate variables so when the algorithm is done, it can return the proper
                    ## token and number of characters.
                    if self._DFAstates[target].accept != -1:
                        lastAcceptState = target
                        lastAcceptPos = currentPos

                    currentState = self._DFAstates[target]
                    currentPos += 1
                else:
                    if lastAcceptState == -1:
                        result = Token(self._errorsymbol)
                        result.data = self._source.read(1)
                    else:
                        symbol = self._symbols[self._DFAstates[lastAcceptState].accept]
                        result = Token(symbol)
                        result.data = self._source.read(lastAcceptPos + 1)
                    break

        except NoDataError:
            result = Token(self._endsymbol)
            result.data = ""

        self.updateLineNumber(result.data)

        return result
    #-------------------------------------------------------------------------
    def updateLineNumber(self, text):
        ''' Internal method.
        '''
        self._linenumber += text.count('\n')
#-----------------------------------------------------------------------------
