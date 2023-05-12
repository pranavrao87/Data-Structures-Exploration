class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def isEmpty(self):
        return len(self.items) == 0

    def peek(self):
        return self.items[len(self.items)-1]

    def size(self):
        return len(self.items)

opens = "([{<"
closed = ")]}>"

def check(string):
    s = Stack()
    for i in string:
        if(i in opens):
            s.push(i)
        elif(i in closed):
            if(s.size() != 0 and opens.index(s.peek()) == closed.index(i)):
               s.pop()
            else:
                return string + " is incorrect."

    if s.isEmpty():
        return string + " is correct."
    else:
        return string + " is incorrect."

print(check("(abc(*def)"))
print(check("[{}]"))
print(check("["))
print(check("[{<()>}]"))
print(check("{<html[value=4]*(12)>{$x}}"))
print(check("[one]<two>{three}(four)"))
print(check("car(cdr(a)(b)))"))
print(check("car(cdr(a)(b))"))

        
