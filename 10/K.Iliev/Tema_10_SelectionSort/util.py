from numpy.random import randint

def input_list():
    n = int(input('input number of elements: '))
    my_list = list(set(randint(1, 50, n)))
    return my_list

def print_list(my_list, before_after):
    print(f'My List {before_after} is {my_list} elements')

def sort_list(my_list):
    n = len(my_list)

    for i in range(0, n):
        min_idx = i
        for j in range(i+1, n):
            if my_list[j] < my_list[min_idx]:
                min_idx = j
        my_list[i], my_list[min_idx] = my_list[min_idx], my_list[i]
    return my_list