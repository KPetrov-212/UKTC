from Util import Bubble
from numpy.random import randint

n = int(input("Enter number of elements /n/: "))
arr = list(randint(0, 100, n))
print(f"Unsorted: {arr}")

array = Bubble(arr)
impl = input("Choose how to sort (for/while): ")
if impl == "for":
    array.bubble_sort_for()
    print(f"Sorted with FOR: {arr}")
elif impl == "while":
    array.sortWhile()
    print(f"Sorted with WHILE: {arr}")