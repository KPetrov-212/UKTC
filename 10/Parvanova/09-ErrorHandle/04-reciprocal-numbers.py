try:
    num = int(input("Enter: "))
    assert num % 2 == 0

except:
    print("Not an even number!")

else:
    reciprocal = 1 / num
    print(reciprocal)
