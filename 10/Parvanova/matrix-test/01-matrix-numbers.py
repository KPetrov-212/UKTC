rows, cols = [int(x) for x in input().split(', ')]
matrix = []

for i in range(rows):
    theRow = [int(x) for x in input().split(', ')]
    matrix.append(theRow)

for row in range(rows):
    for col in range(cols):
        if matrix[row][col] % 3 == 0 and matrix[row][col] % 5 == 0:
            matrix[row][col] = 0
        elif matrix[row][col] % 3 == 0:
            matrix[row][col] = 3
        elif matrix[row][col] % 5 == 0:
            matrix[row][col] = 5

for row in matrix:
    print(', '.join(map(str, row)))
