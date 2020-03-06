# 抽象迭代器类
class Iterator(object):
    def hasNext(self):
        pass

    def next(self):
        pass

# 抽象聚集类
class Aggregate(object):
    def iterator(self):
        pass

class BookShelf(Aggregate):
    def __init__(self):
        self._books = []
        self._last = 0

    def getBookAt(self, index):
        return self._books[index]

    def appendBook(self, book):
        self._books.append(book)
        self._last = self._last + 1

    def getLength(self):
        return self._last

    def iterator(self):
        return BookShelfIterator(self)

class BookShelfIterator(Iterator):
    def __init__(self, bookShelf):
        self._bookShelf = bookShelf
        self._index = 0

    def hasNext(self):
        if self._index < self._bookShelf.getLength():
            return True
        else:
            return False

    def next(self):
        book = self._bookShelf.getBookAt(self._index)
        self._index = self._index + 1
        return book

class Book():
    def __init__(self, name):
        self._name = name

    def getName(self):
        return self._name

if __name__ == "__main__":
    bookShelf = BookShelf()
    bookShelf.appendBook(Book("A"))
    bookShelf.appendBook(Book("B"))
    bookShelf.appendBook(Book("C"))
    bookShelf.appendBook(Book("D"))

    it = bookShelf.iterator()
    while it.hasNext():
        book = it.next()
        print(book.getName())



