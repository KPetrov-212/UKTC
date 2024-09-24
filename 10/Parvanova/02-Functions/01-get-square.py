withComma = input("Enter number and power with (,): ")
list1 = withComma.split(",")
number = int(list1[0])
exponent = int(list1[1])

def getSquare(x, y):
    return pow(x, y)

power = getSquare(number, exponent)

print(f"{number} to the power of {exponent} is {power}")