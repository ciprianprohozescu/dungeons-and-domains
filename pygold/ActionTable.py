from Action import *

class ActionTable:
    ''' Internal class. You do not need to understand it to use parser.
    '''
    def __init__(self):
        self._actionmap = {}

    def __repr__(self):
        return "ActionTable(%s)" % `self._actionmap`

    def getActionForSymbol(self, symbolindex):
        try:
            return self._actionmap[symbolindex]
        except:
            return None


    def append(self, item):
        self._actionmap[item.symbol.index] = item
    