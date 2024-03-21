from util_ins import input_list, print_list, insertionSort

my_list = input_list()

print_list(my_list, 'BEFORE')
insertionSort(my_list)
print_list(my_list, 'AFTER')