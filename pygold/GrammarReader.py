from array import *
from struct import *
from Consts import *

class GrammarReader:
    ''' Internal class. You do not need to understand it to use parser.
    '''
    c_filetype = u"GOLD Parser Tables/v1.0"

    def __init__(self, filename, encoding = None):
        self.reader = file(filename, 'rb')
        self.queue = []
        self.encoding = encoding
        if not self.hasValidHeader():
            raise ParserException, 'File has no valid CGT header'

    def moveNext(self):
        try:
            content = self.readByte()
            if content == EnumEntryContent.Multi:
                self.queue = []
                count = self.readInt16()
                while count > 0:
                    self.readEntry()
                    count -= 1
                return True
            else:
               return False
        except error: ## end of stream - no more bytes
            return False

    def retrieveNext(self):
        if len(self.queue) == 0:
            return None
        else:
            return self.queue.pop(0)

    def retrieveDone(self):
        return len(self.queue) == 0

    def hasValidHeader(self):
        self.reader.seek(0)
        header = self.readString(64) ## read max 64 chars
        return header == self.c_filetype

    def readBool(self):
        ## return unpack('<B', self.reader.read(1))[0] != 0
        return unpack('B', self.reader.read(1))[0] != 0

    def readByte(self):
        ## return unpack('<B', self.reader.read(1))[0]
        return unpack('B', self.reader.read(1))[0]

    def readInt16(self):
        ## return unpack('<h', self.reader.read(2))[0]
        return unpack('h', self.reader.read(2))[0]

    def readString(self, maxsize = -1):
        result = array('u')
        char = None
        while True:
            if (maxsize >= 0) and (len(result) >= maxsize):
                break
            char = self.reader.read(2)
            if (char == '') or (char == '\x00\x00'):
                break
            result.append(char)
        return result.tounicode()

    def readEntry(self):
        content = self.readByte()
        if content == EnumEntryContent.Empty:
            self.queue.append(None)
        elif content == EnumEntryContent.Boolean:
            self.queue.append(self.readBool())
        elif content == EnumEntryContent.Byte:
            self.queue.append(self.readByte())
        elif content == EnumEntryContent.Integer:
            self.queue.append(self.readInt16())
        elif content == EnumEntryContent.String:
            text = self.readString()
            if self.encoding != None:
                text = text.encode(self.encoding)
            self.queue.append(text)
        else:
            raise ParserException, 'Unknown entry-content type in CGT file'

