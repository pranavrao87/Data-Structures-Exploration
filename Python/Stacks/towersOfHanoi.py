class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()

    def peek(self):
        if not self.is_empty():
            return self.items[-1]

    def size(self):
        return len(self.items)

    def __str__(self):
        stringy = ""
        for i in self.items:
            stringy += (str(i) + " ")
        return stringy


def towers_of_hanoi(n, source, destination, auxiliary):
    if n > 0:
        towers_of_hanoi(n-1, source, auxiliary, destination)

        disk = source.pop()
        destination.push(disk)
        print(f"Move disk {disk} from {source_name} to {destination_name}")

        towers_of_hanoi(n-1, auxiliary, destination, source)


# Test the function
n = 3
source_stack = Stack()
destination_stack = Stack()
auxiliary_stack = Stack()

source_name = 'Source'
destination_name = 'Destination'
auxiliary_name = 'Auxiliary'

# Push disks onto the source stack in descending order
for i in range(n, 0, -1):
    source_stack.push(i)

towers_of_hanoi(n, source_stack, destination_stack, auxiliary_stack)
