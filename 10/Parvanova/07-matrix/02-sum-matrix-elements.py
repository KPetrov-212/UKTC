row, col = [int(x) for x in input().split(', ')]
matrix = []


for _ in range(row):
    line = [int(x) for x in input().split(', ')]
    matrix.append(line)


total = 0
for i in range(row):
    for j in range(col):
        total += matrix[i][j]


print(total)
print(matrix)