matrix = []
for row in range(4):
    matrix.append([])
    for col in range(4):
        matrix[row].append(0)

[print(*row) for row in matrix]