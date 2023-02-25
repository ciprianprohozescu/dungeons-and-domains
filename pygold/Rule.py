import string
from Symbol import Symbol
from Consts import *
from ContainerProxy import *

class Rule(ContainerProxy):
    ''' Parser's rule.
        Rule has its own 'symbols' and 'index'.
        'index' is used to determine which rule is currently processed.
    '''
    def __init__(self, index, headsymbol):
        self.rule = headsymbol
        self.symbols = []
        self.index = index

    def __containerproxy__(self): return self.symbols

    def __repr__(self):
        return "Rule(rule:%s, symbols:%s, index:%s, definition:(%s))" % (
            `self.rule`,
            `self.symbols`,
            `self.index`,
            self.definition()
        )
    
    def definition(self):
        return "%s ::= %s" % (
            self.rule.name,
            string.join([`i` for i in self.symbols])
        )

    def containsNonTerminal(self):
        return (len(self) == 1) and (self[0].kind == EnumSymbolType.NonTerminal)

    def append(self, item):
        self.symbols.append(item)
