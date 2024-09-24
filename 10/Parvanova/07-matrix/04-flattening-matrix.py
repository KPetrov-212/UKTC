rows = int(input())
matrix = [list(map(int, input().split(", "))) for _ in range(rows)]
print(matrix)

flattened_matrix = [number for row in matrix for number in row]
print(flattened_matrix)