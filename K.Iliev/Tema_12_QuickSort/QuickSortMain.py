from QuickSortMethods import quickSort
from numpy.random import randint


if __name__ == '__main__':
    n = int(input("Enter number of elements /n/: "))
    arr = list(randint(0, 100, n))
    print(f"Unsorted: {arr}")
    
    quickSort(arr, 0, len(arr) - 1)
    
    print(f'Sorted: {arr}')