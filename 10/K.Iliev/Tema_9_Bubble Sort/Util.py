def bubble_sort_for(arr):
    n = len(arr)
    for i in range(n-1):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j + 1]:
                swapped = True
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
        if not swapped:
            return arr
        
def bubble_sort_while(arr):
    n = len(arr)
    swapped = True
    while swapped:
        counter = 0
        swapped = False
        for j in range(0, n-1-counter):
            if arr[j] > arr[j + 1]:
                swapped = True
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
            counter += 1
    return arr