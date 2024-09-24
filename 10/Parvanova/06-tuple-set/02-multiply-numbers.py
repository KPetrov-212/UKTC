nums = tuple([int(x) for x in input().split()])
m, *numbers = nums
multiply_numbers = tuple(map(lambda x : x * m, numbers))

print(multiply_numbers)
