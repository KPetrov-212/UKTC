my_set = [5, 10, 20, 50]
sum = float(input("Sum: ")) * 100
count = 0

for number in reversed(my_set):
    while sum >= number:
        sum -= number
        count += 1
        print(f"Used[{count}]: {number} pennys")

print(f"\nRemaining pennyes: {sum}\nCount: {count}")