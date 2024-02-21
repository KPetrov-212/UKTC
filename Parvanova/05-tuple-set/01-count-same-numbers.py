numbers = tuple(map(float, (input().split(' '))))
non_dublicate_numbers = []

for num in numbers:
    if num not in non_dublicate_numbers:
        non_dublicate_numbers.append(num)
        count_num = numbers.count(num)
        print(f"{num:6}{count_num:6} times")
    pass


# count_nums = tuple1.count(8)
# print(count_nums)

# index_nums = tuple1.index(6)
# print(tuple)