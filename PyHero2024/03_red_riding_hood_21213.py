def checker(x, y, n):
    global gubi
    if matrix[x][y] == "W":
        print("Oops, I met a Wolf! \nGAME OVER!")
        exit()
    elif matrix[x][y] == "H":
        print(f"Grandma, I`m here! I`ve collected {gubi} mushrooms on the way!")
        exit()
    elif (x > n or y > n) or (x < 0 or y < 0):
        print("You can`t get out from the woods!")
        return False
    else:
        gubi += int(matrix[x][y])
        matrix[x][y] = 0

matrix = []
gubi = 0
n = int(input())
for _ in range(n):
    matrix.append(list(input().split(' ')))
moves = [i for i in input().split(', ')]

x, y = 0, 0
for move in moves:
    if move == "Right":
        if checker(x, y + 1, n) == False:
            pass
        else:
            y += 1
    elif move == "Left":
        if checker(x, y -1, n) == False:
            pass
        else:
            y -= 1
    elif move == "Up":
        if checker(x - 1, y, n) == False:
            pass
        else:
            x -= 1
    elif move == "Down":
        if checker(x + 1, y, n) == False:
            pass
        else:
            x += 1
print("Help, I`m lost!")

        
