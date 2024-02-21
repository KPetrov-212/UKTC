numbers = range(100)
list = [n for n in numbers if n % 2 == 0 and n % 5 == 0]
list.reverse()
print(list)