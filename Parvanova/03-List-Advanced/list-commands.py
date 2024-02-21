N = int(input())
my_list = []

i = 0
while i < N:
    command = [x for x in input().split()]
    i += 1

    match command[0]:
        case 'insert':
            my_list.insert(int(command[1]), int(command[2]))
        case 'print':
            print(my_list)
        case 'remove':
            my_list.remove(int(command[1]))
        case 'append':
            my_list.append(int(command[1]))
        case 'sort':
            my_list.sort()
        case 'pop':
            my_list.pop()
        case 'reverse':
            my_list.reverse()