try:
    num = float(input("Enter a number: "))
    result = 10 / 0
    print(result)
except ZeroDivisionError:
    print("Zero division is not supported")