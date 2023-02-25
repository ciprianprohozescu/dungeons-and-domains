def enumName(classptr, value, default = None):
    ''' Gets enum name as string.
        for example:
        >>> enumName(EnumParseMessage, 0)
        "TokenRead"
    '''
    members = classptr.__dict__
    for key in members:
        if members[key] is value:
            return key
    return default
