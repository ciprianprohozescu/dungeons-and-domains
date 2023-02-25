from Symbol import Symbol

class Token(Symbol):
    ''' Parser's token.
    '''
    def __init__(self, symbol = None):
        Symbol.__init__(self)
        self.state = -1
        self.data = ""
        if symbol is not None:
            self.copyData(symbol)

    def __repr__(self):
        return 'Token(%s, state:%s, data:%s)' % (Symbol.__repr__(self), `self.state`, `self.data`)
