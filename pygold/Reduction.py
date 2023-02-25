from ContainerProxy import *
from Rule import Rule

class Reduction(ContainerProxy):
    ''' Reduction object.
        Reduction has it's 'tokens' and responsible 'rule'.
    '''
    def __init__(self):
        ''' Constructor.
            Creates empty reduction.
        '''
        self.tokens = []
        self.rule = None
        self.tag = None

    def __containerproxy__(self): return self.tokens

    def __repr__(self):
        return 'Reduction(tokens:%s, rule:%s, tag:%s' % (
            `self.tokens`,
            `self.rule`,
            `self.tag`
        )

    def dormant(self):
        ''' Makes reduction dormant.
            It is used to cut obsolete (already processed) data while parsing.
            Returns None
        '''
        self.tokens = []

    def append(self, item):
        ''' Appends a token to reduction.
            Returns None
        '''
        self.tokens.append(item)