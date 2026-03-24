def limit_list(numbers, limit):
    return list(map(lambda x: 0 if x > limit else x, numbers))


lst = [1, 5, 10, 3, 8]
n = int(input("Въведи число: "))

print(limit_list(lst, n))