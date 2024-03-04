from numpy.random import randint

def separation(arr):
    for element in arr:
        if element % 2 == 0:
            even.append(element)
        else:
            odd.append(element)

def ascending(even):
    n = len(even)
    swapped = True
    while swapped:
        counter = 0
        swapped = False
        for j in range(0, n-1-counter):
            if even[j] > even[j + 1]:
                swapped = True
                even[j], even[j + 1] = even[j + 1], even[j]
            counter += 1
    return even

def descending(odd):
    n = len(odd)
    swapped = True
    while swapped:
        counter = 0
        swapped = False
        for j in range(0, n-1-counter):
            if odd[j] < odd[j + 1]:
                swapped = True
                odd[j], odd[j + 1] = odd[j + 1], odd[j]
            counter += 1
    return odd

if __name__ == '__main__':
    n = int(input("Enter number of elements /n/: "))
    arr = list(randint(0, 100, n))

    even, odd = [], []

    separation(arr)
    print(f"Unsorted: {arr}")
    print("even: ", ascending(even))
    print("odd: ", descending(odd))

