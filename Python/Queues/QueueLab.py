class Queue:
    def __init__(self):
        self.items = []

    def add(self, item):
        self.items.insert(0, item)

    def remove(self):
        return self.items.pop()

    def peek(self):
        return self.items[-1]

    def isEmpty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)
    
    def __str__(self):
        string = ""
        for i in self.items:
            string += str(i)
        return string
    
class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[-1]

    def isEmpty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def __str__(self):
        string = ""
        for i in self.items:
            string += str(i)
        return string



def isPList(pList):
    q = Queue()
    s = Stack()
    for x in pList:
        q.add(x)
        s.push(x)
    while s.size() > 0:
        a = s.pop()
        b = q.remove()
        if a != b:
            return pList, " is not a palinlist."
    return pList, " is a palinlist."

print(isPList(["one", "two", "three", "two", "one"]))
print(isPList([1, 2, 3, 4, 5, "one", "two", "three", "four", "five"]))
print(isPList(["a", "b", "c", "d", "e", "f", "g", "x", "y", "z", "g", "f", "h"]))
print(isPList(["racecar", "is", "racecar"]))
print(isPList([1, 2, 3, "a", "b", "c", "c", "b", "a", 3, 2, 1]))
print(isPList(["chicken", "is", "a", "chicken"]))
