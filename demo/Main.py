#!/usr/bin/env python
#Boa:PyApp:main

modules ={'Action': [0, '', 'Action.py'],
 'Consts': [0, '', 'Consts.py'],
 'EnumHelper': [0, '', 'EnumHelper.py'],
 'GrammarReader': [0, '', 'GrammarReader.py'],
 'LookAheadReader': [0, '', 'LookAheadReader.py'],
 'Parser': [0, '', 'Parser.py'],
 'PyIDL': [0, '', 'PyIDL.py'],
 'Reduction': [0, '', 'Reduction.py'],
 'Rule': [0, '', 'Rule.py'],
 'Symbol': [0, '', 'Symbol.py'],
 'Token': [0, '', 'Token.py'],
 'TokenStack': [0, '', 'TokenStack.py']}

import math

import pygold
from simplecalculator import *

## input tokens will be collected in 'input' string
input = ''
## dictionary of external symbols for calculator
## you may add varailables and function to it that
## can be used in calculator's expressions
externals = {}

def onToken(parser, token):
    ## - use token.data to extract token's string
    ## - use token.index to determine it's type
    global input
    input += token.data

    if token.index == SYMBOL_NUMBER:
        ## if token is a number convert string to float
        token.data = float(token.data)

def onReduction(parser, reduction, tokens):
    ## - use tokens[n].data to extract underlaying data
    ## - use reduction.data to pass result
    ##   it will be available as token[n].data on higher tree levels
    ## - use reduction.data.rule.index to determine which rule is reduced

    global externals
    rule = reduction.data.rule.index

    # <expression_list> ::= <expression_list> ',' <expression>
    if rule == RULE_EXPRESSION_LIST_COMMA:
        ## recursivly defined comma-separated-list
        if isinstance(tokens[0].data, list):
            ## n-th item, <expression> is already a list
            ## ...so append new item to this list
            reduction.data = tokens[0].data + tokens[2].data
        else:
            ## 1-st item, <expression> is just a token
            ## ...so create list with 2-elements
            reduction.data = [tokens[0].data, tokens[2].data]

    # <expression_add> ::= <expression_add> '+' <expression_mul>
    elif rule == RULE_EXPRESSION_ADD_PLUS:
        reduction.data = tokens[0].data + tokens[2].data

    # <expression_add> ::= <expression_add> '-' <expression_mul>
    elif rule == RULE_EXPRESSION_ADD_MINUS:
        reduction.data = tokens[0].data - tokens[2].data

    # <expression_mul> ::= <expression_mul> '*' <expression_pow>
    elif rule == RULE_EXPRESSION_MUL_TIMES:
        reduction.data = tokens[0].data * tokens[2].data

    # <expression_mul> ::= <expression_mul> '/' <expression_pow>
    elif rule == RULE_EXPRESSION_MUL_DIV:
        reduction.data = tokens[0].data / tokens[2].data

    # <expression_pow> ::= <expression_pow> '^' <expression_neg>
    elif rule == RULE_EXPRESSION_POW_CARET:
        reduction.data = tokens[0].data ** tokens[2].data

    # <expression_neg> ::= '-' <expression_neg>
    elif rule == RULE_EXPRESSION_NEG_MINUS:
        reduction.data = -tokens[1].data

    # <r_value> ::= '(' <expression> ')'
    elif rule == RULE_R_VALUE_LPARAN_RPARAN:
        reduction.data = tokens[1].data

    # <r_value> ::= number
    elif rule == RULE_R_VALUE_NUMBER:
        ## this hander is not really needed 'cause it can
        ## be handled by default handler, but I wanted
        ## to explicitly define it
        reduction.data = tokens[0].data

    # <l_value> ::= identifier
    elif rule == RULE_L_VALUE_IDENTIFIER:
        ## extract proper identifier from externals dictionary
        reduction.data = float(externals[tokens[0].data])

    # <l_value> ::= identifier '(' ')'
    elif rule == RULE_L_VALUE_IDENTIFIER_LPARAN_RPARAN:
        ## call function with no params
        reduction.data = float(externals[tokens[0].data]())

    # <l_value> ::= identifier '(' <expression_list> ')'
    elif rule == RULE_L_VALUE_IDENTIFIER_LPARAN_RPARAN2:
        ## call function with params
        args = tokens[2].data

        ## convert args to tuple (it can be number or list of numbers)
        if isinstance(args, list):
            args = tuple(args)
        else:
            args = (args,)

        reduction.data = float(externals[tokens[0].data](*args))

    # <l_value> ::= identifier '[' <expression> ']'
    elif rule == RULE_L_VALUE_IDENTIFIER_LBRACKET_RBRACKET:
        ## extract proper identifier and treat it as list
        reduction.data = float(externals[tokens[0].data][int(tokens[2].data)])

    # <l_value> ::= identifier '.' <l_value>
    elif rule == RULE_L_VALUE_IDENTIFIER_DOT:
        raise Exception("Member extracting is not supported")

    else:
        ## for other rules just pass data up the parse tree
        ## it's not safe but in this case all 'other rules' are
        ## transparent
        reduction.data = tokens[0].data

def main():
    global input
    externals['alfa'] = 7
    externals['sin'] = math.sin
    externals['cos'] = math.cos

    ## Yes, I'm using windows-1250 codepage
    ## for this moment Unicode is *NOT* supported so you
    ## have to specify codepage, use 'utf-8' if you're not
    ## sure which you should use
    p = pygold.Parser('simplecalculator.cgt', 'windows-1250')

    p.openFile('test.input.txt')
    p.onReduction = onReduction
    p.onToken = onToken
    input = ''
    result = p.parse()
    p.close()
    print '%s = %f' % (input, result)

    p.openText('2+3*7/sin(cos(alfa*4)+5)')
    input = ''
    result = p.parse()
    p.close()
    print '%s = %f' % (input, result)

if __name__ == '__main__':
    main()
