from collections import deque

data_str = input()

data_deque = deque(data_str.split("-"))
data_deque.reverse()

formatted_data = ".".join(data_deque)
print(formatted_data)