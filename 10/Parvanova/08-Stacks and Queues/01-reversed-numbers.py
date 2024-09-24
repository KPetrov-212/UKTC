from collections import deque
numbers_str = deque(input())

queue = deque()
flag = True
while flag:
    command = input()
    if command == "Info":
        while len(queue):
            print(queue.popleft())
    elif command == "End":
        print(f"{len(queue)} customers ramaining")
        flag = False
    else:
        queue.append(command)

    if not flag:
        break