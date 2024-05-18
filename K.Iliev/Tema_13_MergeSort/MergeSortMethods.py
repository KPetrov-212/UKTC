import random

def input_list() -> list:
    n = int(input('Number of elements: '))
    my_list = random.sample(range(-50, 50), n)
    return my_list

def print_list(my_list: list, bef_aft: bool) -> None:
    message = 'List BEFORE: ' if bef_aft else 'List AFTER: '
    print(message, my_list)
    return None

def merge(my_list: list, low: int, mid: int, high: int) -> None:
    n1 = mid - low + 1
    n2 = high - mid
    
    L = my_list[low:mid+1]
    R = my_list[mid+1:high+1]

    i = j = 0
    k = low

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            my_list[k] = L[i]
            i += 1
        else:
            my_list[k] = R[j]
            j += 1
        k += 1

    while i < n1:
        my_list[k] = L[i]
        i += 1
        k += 1

    while j < n2:
        my_list[k] = R[j]
        j += 1
        k += 1
    return None

def merge_sort(my_list: list, low: int, high: int) -> None:
    if low < high:
        mid = (low + high) // 2

        merge_sort(my_list, low, mid)
        merge_sort(my_list, mid + 1, high)

        merge(my_list, low, mid, high)
    return None