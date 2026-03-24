def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    if b == 0:
        return "Грешка: деление на 0"
    return a / b

a = int(input("Първо число: "))
b = int(input("Второ число: "))
op = input("Операция (+, -, *, /): ")

if op == "+":
    print(add(a, b))
elif op == "-":
    print(subtract(a, b))
elif op == "*":
    print(multiply(a, b))
elif op == "/":
    print(divide(a, b))
else:
    print("Невалидна операция")