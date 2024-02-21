rows, cols = [int(x) for x in input().split(', ')]
matrix = [list(map(int, input().split(", "))) for _ in range(rows)]
print(matrix)

column_sums = [sum(matrix[i][j] for i in range(rows)) for j in range(cols)]
print(column_sums)