from numpy.random import randint

def input_list():
    n = int(input('input number of elements: '))
    my_list = list(set(randint(1, 50, n)))
    return my_list

def print_list(my_list, before_after):
    print(f'My List {before_after} is {my_list} elements')

def insertionSort(my_list):
    n = len(my_list) 
 
    for i in range(1, n):  
        element = my_list[i]  
        j = i-1
        while j >= 0 and element < my_list[j]: 
            my_list[j+1] = my_list[j] 
            j -= 1
        my_list[j+1] = element