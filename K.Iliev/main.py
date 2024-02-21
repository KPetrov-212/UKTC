import numpy as np

def find_max_element(my_list_here):
    current_max = np.max(my_list_here)
    print(current_max)

if __name__ == '__main__':
    N = int(input("Enter the number of elements: "))
    my_list = np.random.randint(0, 50, N)
        
    print(my_list)
    find_max_element(my_list)