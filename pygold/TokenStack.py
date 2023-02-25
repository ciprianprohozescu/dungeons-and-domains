from Token import Token
from ContainerProxy import *

class TokenStack(ContainerProxy):
    ''' TokenStack is a simple stack. It holds instances of Token
        add provides basic stack services like: push, pop and peek.
    '''
    def __init__(self):
        ''' Constructor. Creates empty stack.
        '''
        self.items = []

    def __containerproxy__(self): 
        ''' Used internally by ContainerProxy to provide indexed access.
            Returns list of objects.
        '''
        return self.items
    
    def __repr__(self):
        ''' Text representation of a stack. Usable while debugging.
            Returns textual representation.
        '''
        return 'TokenStack(%s)' % `self.items`

    def clear(self):
        ''' Clears the stack.
            returns None.
        '''
        self.items = []

    def pushToken(self, token):
        ''' Pushes token on the top of stack.
            Returns None.
        '''
        self.items.append(token)

    def peekToken(self):
        ''' Peeks token from the top of stack. Token is *not* removed.
            Returns token.
        '''
        return self.items[-1]

    def popToken(self):
        ''' Pops token from the top of stack.
            Returns token.
        '''
        return self.items.pop()

    def popTokensInto(self, reduction, count):
        ''' Pops 'count' tokens from the stack and appends them
            to specified 'reduction'.
            Returns None.
        '''
        l = self.items[-count:]
        del self.items[-count:]
        for i in l:
            reduction.append(i)