def quickSort(arr, start, end):
    if start >= end:
        return
    pi = partition(arr, start, end)
    quickSort(arr, start, pi - 1)
    quickSort(arr, pi + 1, end)

def partition(arr, start, end):
    pivot = arr[end]

    i = start - 1

    for j in range(start, end):
        if arr[j] <= pivot:
            i = i + 1
            arr[i], arr[j] = arr[j], arr[i]
    
    arr[i+1], arr[end] = arr[end], arr[i+1]

    return i + 1    
