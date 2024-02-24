from Util import bubble_sort_for
from Util import bubble_sort_while
from numpy.random import randint

n = int(input("Enter number of elements /n/: "))
arr = list(randint(0, 100, n))
print(f"Unsorted: {arr}")


sorted_for = arr[:]
sorted_while = arr[:]

bubble_sort_for(sorted_for)
print(f"Sorted with FOR: {sorted_for}")

bubble_sort_while(sorted_while)
print(f"Sorted with WHILE: {sorted_while}")