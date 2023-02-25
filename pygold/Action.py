from Consts import *
from EnumHelper import *

class Action: ## LRAction in C# code
    ''' Internal class. You do not need to understand it to use parser.
    '''
    def __init__(self, symbol = None, action = EnumAction.Error, value = 0):
        self.symbol = symbol
        self.action = action
        self.value = value

    def __repr__(self):
        return "Action(symbol:%s, action:%s, value:%s)" % (
            `self.symbol`,
            enumName(EnumAction, self.action, '?'),
            `self.value`
        )
