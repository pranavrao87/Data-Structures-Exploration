import time
import random

#Has a big O of n b/c it has to iterates the length of the entire list, n
def linearSearch(items, target):
    for x in range(0, len(items) -1):
        if items[x] == target:
            return x
    return -1

#Has a big O of log base 2 of n b/c it keeps splitting the list
#into as many halves as possible so 2^n or log base 2 of n.
def binarySearch(items, target, start, end):
    if end >= start:
        middle = (start + end)//2
        if items[middle] == target:
            return middle
        if items[middle] > target:
            return(binarySearch(items, target, start, middle-1))
        if items[middle] < target:
            return(binarySearch(items, target, middle+1, end))
    else:
        return -1
    

def randomListGen(length):
    listy = []
    for x in range(0, length):
        listy.append(random.randint(0,10000))
    return listy

one = randomListGen(10000)
s1 = sorted(one)

two = randomListGen(20000)
s2 = sorted(two)

three = randomListGen(30000)
s3 = sorted(three)

#linear search - list length: 100
start = time.time()
print(linearSearch(one, 234))
end = time.time()
print("size: %d time: %f" % (len(one), end-start))

#linear search - list length: 1000
start = time.time()
print(linearSearch(two, 234))
end = time.time()
print("size: %d time: %f" % (len(two), end-start))

#linear search - list length: 1000000
start = time.time()
print(linearSearch(three, 234))
end = time.time()
print("size: %d time: %f" % (len(three), end-start))


#binary search - list length: 1000
start = time.time()
print(binarySearch(s1, 234, 0, len(s1)-1))
end = time.time()
print("size: %d time: %f" % (len(s1), end-start))

#binary search - list length: 2000
start = time.time()
print(binarySearch(s2, 234, 0, len(s2)-1))
end = time.time()
print("size: %d time: %f" % (len(s2), end-start))

#binary search - list length: 3000
start = time.time()
print(binarySearch(s3, 234, 0, len(s3)-1))
end = time.time()
print("size: %d time: %f" % (len(s3), end-start))



