class ContainerProxy:
    '''This class is used to implement list interface in one step.
    Just implement __containerproxy__() function which returns container
    and derive your class from ContainerProxy. Every container-like calls
    (ie. myobject[index]) will be redirected to, for example,
    myobject.__containerproxy__()[index].'''
    def __len__(self):
        return self.__containerproxy__().__len__()
    
    def __getitem__(self, key):
        return self.__containerproxy__().__getitem__(key)
    
    def __setitem__(self, key, value):
        return self.__containerproxy__().__setitem__(key, value)
    
    def __delitem__(self, key):
        return self.__containerproxy__().__delitem__(key)
    
    def __iter__(self):
        return self.__containerproxy__().__iter__()
    
    def __contains__(self, item):
        return self.__containerproxy__().__contains__(item)