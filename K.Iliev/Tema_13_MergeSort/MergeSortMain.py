from MergeSortMethods import input_list, print_list, merge_sort

def main():  # po "javarsko" za da se haresa na gospodina :D
    my_list = input_list()
    print_list(my_list, True)

    n = len(my_list)
    merge_sort(my_list, 0, n-1)

    print(f'Sorted: {my_list}')

if __name__ == '__main__':
    main()
