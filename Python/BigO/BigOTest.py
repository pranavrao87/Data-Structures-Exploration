import random
import time
from random import randrange

#2. Big O for insertionSort is O(n^2) b/c of the two nested loops
# which when approaching really large numbers run essentially n times
# making the big O for selection sort O(n^2)
def insertionSort(arr):
    for i in range(1, len(arr)):
        temp = arr[i]
        j = i-1
        while j >= 0 and temp < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = temp
    return arr

#2. Big O for selectionSort is also O(n^2) b/c of the two nested loops
# which when approaching really large numbers run essentially n times
# making the big O for selection sort also O(n^2)
def selectionSort(arr):
    for i in range(0, len(arr)-1):
        minimum = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[minimum]:
                minimum = j
        (arr[i], arr[minimum]) = (arr[minimum], arr[i])
    return arr


def randomListGen(length):
    rlist = []
    for i in range(0, length):
        rlist.append(random.randint(0, 10000))
    return rlist


def avgCaseInsertion():
    print("\nAverage/random Test Cases:")
    for i in range(1, 11):
        alist = randomListGen(i * 1000)
        start = time.time()
        insertionSort(alist)
        end = time.time()
        print("Size: %d Time: %f" % (i*1000, end-start))

def avgCaseSelection():
    print("\nAverage/random Test Cases:")
    for i in range(1, 11):
        blist = randomListGen(i * 1000)
        start = time.time()
        selectionSort(blist)
        end = time.time()
        print("Size: %d Time: %f" % (i*1000, end-start))

def bestCaseSelection():
    clist = randomListGen(1000)
    selectionSort(clist)
    start = time.time()
    selectionSort(clist)
    end = time.time()
    print("\nBest case - 1000 items: %f" %(end-start))

def bestCaseInsertion():
    dlist = randomListGen(1000)
    selectionSort(dlist)
    start = time.time()
    insertionSort(dlist)
    end = time.time()
    print("\nBest case - 1000 items: %f" %(end-start))

def tempReverseSort(arr):
    for i in range(1, len(arr)):
        temp = arr[i]
        j = i-1
        while j >= 0 and temp > arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = temp
    return arr

def worstCaseSelection():
    elist = tempReverseSort(randomListGen(1000))
    start = time.time()
    selectionSort(elist)
    end = time.time()
    print("\nWorst case - 1000 items: %f" %(end-start))


def worstCaseInsertion():
    flist = tempReverseSort(randomListGen(1000))
    start = time.time()
    insertion(flist)
    end = time.time()
    print("\nWorst case - 1000 items: %f" %(end-start))

print("Type of Sort: Selection")    
bestCaseSelection()
avgCaseSelection()
worstCaseSelection()

print("\n\nType of Sort: Insertion")    
bestCaseInsertion()
avgCaseInsertion()
worstCaseSelection()

'''4. 
Big O for best case of insertion sort is n and is different because the inner
loop never actually runs for the insertion sort making the sort n. However,
everything else came out as expected as O(n^2)'''
