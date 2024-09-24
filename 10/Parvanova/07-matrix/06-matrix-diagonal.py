n = int(input())
matrix = [list(map(int, input().split())) for _ in range(n)]
[print(row) for row in matrix]

primary_diagonal = [matrix[i][i] for i in range(n)]
print(sum(primary_diagonal))
secondary_diagonal = [matrix[i][n-i-1] for i in range(n)]
print(sum(secondary_diagonal))