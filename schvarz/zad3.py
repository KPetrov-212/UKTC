matrix = [
    [2, 4, 6, 8],
    [10, 12, 14, 16],
    [18, 20, 22, 24],
    [26, 28, 30, 32]
]

num = int(input("Enter num: "))

if num % 2 != 0 or num < 2 or num > 32:
    print("Not found!")
else:
    i = (num - 2) // 2
    r = i // 4
    c = i % 4
    print(f"{{{r}, {c}}}")