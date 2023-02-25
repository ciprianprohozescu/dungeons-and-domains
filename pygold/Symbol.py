from Consts import *
from EnumHelper import *

class Symbol:
    ''' Parser's symbol.
    '''
    def __init__(self, index = -1, name = "", kind = EnumSymbolType.Error):
        self.index = index
        self.name = name
        self.kind = kind

    def __eq__(self, other):
        return (self.name == other.name) and (self.kind == other.kind)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __hash__(self):
        return self.name.__hash__() ^ self.kind.__hash__()

    def __repr__(self):
        return 'Symbol(kind:%s, index:%s, name:%s)' % (
            enumName(EnumSymbolType, self.kind, '?'),
            `self.index`, 
            `self.name`
        )

    def copyData(self, other):
        self.name = other.name
        self.kind = other.kind
        self.index = other.index
