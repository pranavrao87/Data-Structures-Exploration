import random
class pq:
    def __init__(self):
        self.items = []

    def add(self, item):
        self.items.insert(0, item)

    def remove(self):
        high = len(self.items) -1
        for i in range(0,len(self.items)-1):
            if self.items[i] > self.items[high]:
                high = i
        return self.items.remove(self.items[high])

    def isEmpty(self):
        return len(self.items) == 0

    def peek(self):
        return self.items[-1]

    def size(self):
        return len(self.items)

    def __str__(self):
        string = ""
        for i in self.items:
            string += str(i.name) + " "
        return string


class patient:
    def __init__(self, name):
        self.s = random.randrange(0, 10, 1)
        self.name = name
        
    def __gt__(self, other):
        if self.s > other.s:
            return True
        return False
    def __str__(self):
        return self.name + " has a severity of " + str(self.s)


John = patient("John")
Bob = patient("Bob")
Joe = patient("Joe")
Joey = patient("Joey")
print(John)
print(Bob)
print(Joe)
print(Joey)

waitList = pq()

waitList.add(John)
waitList.add(Bob)
waitList.add(Joe)
waitList.add(Joey)

print(waitList)
waitList.remove()
print(waitList)
waitList.remove()
print(waitList)
waitList.remove()
print(waitList)
waitList.remove()
print(waitList)
