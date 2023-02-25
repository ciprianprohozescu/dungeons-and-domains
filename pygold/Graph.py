from ContainerProxy import ContainerProxy
import array

class Edge:
    ''' Internal class. You do not need to understand it to use parser.
    '''
    def __init__(self, chars = '', index = -1):
        self.chars = chars
        self.target = index

    def __repr__(self):
        return 'Edge(chars:%s, target:%s)' % (`self.chars`, `self.target`)

class State:
    ''' Internal class. You do not need to understand it to use parser.
    '''
    def __init__(self):
        ## self.edges = [] ## old code
        self.accept = -1
        # two character maps
        # - map_array - for 0 <= c <= 255
        # - map_dict  - for c > 255 (unicode)
        self.map_array = array.array('i', [-1]*256)
        self.map_dict = {}

## old method with in-string search
##    def addEdge(self, edge):
##        if len(edge.chars) == 0:
##            self.edges.append(edge)
##        else:
##            try:
##                index = [x.target == edge.target for x in self.edges].index(True)
##                self.edges[index].chars += edge.chars
##            except ValueError:
##                self.edges.append(edge)

    def addEdge(self, edge):
        for c in [ord(c) for c in edge.chars]:
            try:
                self.map_array[c] = edge.target
            except IndexError:
                self.map_dict[c] = edge.target
    
##    def getTargetForArr(self, c):
##        for edge in self.edges:
##            chars = edge.chars
##            if c in edge.chars:
##                return edge.target
##        return -1
    
    def getTargetFor(self, c):
        try:
            return self.map_array[ord(c)]
        except IndexError:
            try:
                return self.map_dict[ord(c)]
            except:
                pass
        return -1

##    def __repr__(self):
##        return 'State(%s, %s)' % (`self.edges`, `self.accept`)

    def edgesDict(self):
        ''' Returns dictionary target->chars.
            This dictionary is build every time you call this method
            so it's used for debug purposes only.
        '''
        result = {}
        for i in xrange(len(self.map_array)):
            t = self.map_array[i]
            c = chr(i)
            
            if t != -1:
                if not result.has_key(t):
                    result[t] = c
                else:
                    result[t] += c
        return result

    def __repr__(self):
        return 'State(map:%s, accept:%s)' % (`self.edgesDict()`, `self.accept`)
