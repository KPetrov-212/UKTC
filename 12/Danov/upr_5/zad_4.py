n = int(input("Enter an integer: "))
result = list(range(1, n + 1))
print(result)

descending_values = list(range(n, 0, -1))
result_dict = dict(zip(result, descending_values))
print(result_dict)