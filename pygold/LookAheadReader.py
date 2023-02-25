import array
from Consts import *
#-----------------------------------------------------------------------------
class AbstractLookAheadReader:
    ''' Abstract data provider for parser.
        If you want to create your own provider (ie: direct input
        from internet server) you must override these methods:
        close, peek and read, and initialize parser with 
        parser.openReader(myreader).
    '''
    def close(self):
        ''' When parser ends its task it closes the source.
            If you don't need any special close-procedure
            just leave it empty.
        '''
        pass
    
    def peek(self, pos = 0):
        ''' It is expected that peek method returns
            next character from input stream without changing
            current position. As it is LookAheadReader you
            must implement functionality to return chars
            from the current position + specified number of characters.
            So, if buffer look like 'abcdef' and current position
            is 1 (points to 'b')
                peek(0) should return 'b'
            and
                peek(2) should return 'd'
            When the end of stream is reached you should
            raise NoDataError exception. It the only way
            to stop parsing.
            WARNING: 
                It is expected that last character in a stream
                is '\\n' so if you are not sure add it virtually.
                See implementation of LookAheadStringReader.
            Param pos is a look ahead character count (default value must be 0)
            Returns character[current_position + pos]
            Raises NoDataError if end of stream reached
            
        '''
        raise NoDataError, 'No more data in input'
    
    def read(self, length = 1):
        ''' Read length characters from input stream. Current position
            should be updated.
            WARNING: 
                It is expected that last character in a stream
                is '\\n' so if you are not sure add it virtually.
                See implementation of LookAheadStringReader.
            Param length is a length of expected result (default value should be 1)
            Returns character[current_position : current_position + length]
            Raises NoDataError if end of stream reached
        '''
        raise NoDataError, 'No more data in input'
#-----------------------------------------------------------------------------
class LookAheadStringReader(AbstractLookAheadReader):
    ''' Reader for string-passed input.
        It's a good choice for small input or input which is
        stored in memory anyway.
    '''
    def __init__(self, text):
        ''' Constructor. Open input stream. 
            Param text is a text to parse
        '''
        self.text = None
        self.open(text)

    def __del__(self):
        ''' Destructor. Closes input stream.
        '''
        self.close()

    def open(self, text):
        ''' Opens a stream. You do not have to use it directly
            if you already passed string to the constructor.
            Param text is a text to parse
            Returns None
        '''
        if self.text != None:
            self.close()
        self.text = text
        self.curpos = 0

    def close(self):
        ''' Closes a stream.
            In fact it removes a reference to passed string.
            Returns None
        '''
        self.text = None
        try: del self.curpos
        except: pass

    def peek(self, pos = 0):
        ''' Peeks a character from current position + specified
            number of characters.
            Returns character[current_position + pos]
        '''
        ## last char must be \n so add it virtually
        pos += self.curpos
        
        if pos == len(self.text):
            return '\n'
        elif pos > len(self.text):
            raise NoDataError, 'No more data in input string'
        return self.text[pos]

    def read(self, length = 1):
        ''' Reads length characters from input stream. Current position
            is updated.
            Param length is length of output string
            Returns string containing length characters
        '''
        ## last char must be \n so add it virtually
        endpos = self.curpos + length
        result = self.text[self.curpos : endpos]
        if endpos == len(self.text) + 1:
            result += '\n'
        elif endpos > len(self.text) + 1:
            self.curpos = len(self.text) + 1
            raise NoDataError, 'No more data in input string'
        else:
            self.curpos = endpos
        return result
#-----------------------------------------------------------------------------
class LookAheadFileReader(AbstractLookAheadReader):
    ''' Reader for disk files or other objects that provides
        file-like read method.
    '''
    __BUFFERSIZE = 0x2000 ## something about disk's cluster size

    def __init__(self, stream):
        ''' Constructor. Opens a stream for file reading.
            Param stream is a file object or other object with read method
        '''
        self.stream = None
        self.open(stream)

    def __del__(self):
        ''' Destructor. Closes a stream.
        '''
        self.close()

    def open(self, stream):
        ''' Opens a stream for file reading.
            You don't need to use it directly if you've passes file
            object to contructor.
            Param stream is a file object or other object with read method
        '''
        if self.stream is not None:
            self.close()
        self.stream = stream
        self.buffer = array.array('c')
        self.curpos = -1

    def close(self):
        ''' Closes a stream.
        '''
        if self.stream is not None:
            self.stream.close()
        self.stream = None
        
        try: del self.buffer
        except: pass
        
        try: del self.curpos
        except: pass
    
    def __appendCRLF(self):
        if len(self.buffer) < self.__BUFFERSIZE:
            self.buffer.append('\n')

    def __peek(self, size):
        ''' Internal.
            Asures that next 'size' characters fits in memory buffer.
        '''
        available = len(self.buffer) - self.curpos
        
        if self.curpos == -1:
            self.buffer.fromstring(self.stream.read(self.__BUFFERSIZE))
            self.__appendCRLF()
            self.curpos = 0
        elif available < size:
            if len(self.buffer) < self.__BUFFERSIZE:
                raise NoDataError, 'No more data in input file'
            else:
                del self.buffer[:self.curpos]
                self.buffer.fromstring(self.stream.read(available))
                self.__appendCRLF()
                self.curpos = 0

    def peek(self, pos = 0):
        ''' Peeks a character from current position + specified
            number of characters.
            Returns character[current_position + pos]
        '''
        self.__peek(pos + 1)
        return self.buffer[self.curpos + pos]

    def read(self, length = 1):
        ''' Reads length characters from input stream. Current position
            is updated.
            Param length is length of output string
            Returns string containing length characters
        '''
        self.__peek(length)
        result = self.buffer[self.curpos : self.curpos + length].tostring()
        self.curpos += length
        return result
