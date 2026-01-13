def area_square(a):
    return a * a

def area_rectangle(a, b):
    return a * b

def area_triangle(a, b):
    return (a * b) / 2


choice = int(input("Изберете фигура (1-квадрат, 2-правоъгълник, 3-триъгълник): "))

if choice == 1:
    a = float(input("Страна a: "))
    print("Лице:", area_square(a))

elif choice == 2:
    a = float(input("Страна a: "))
    b = float(input("Страна b: "))
    print("Лице:", area_rectangle(a, b))

elif choice == 3:
    a = float(input("Основа a: "))
    b = float(input("Височина b: "))
    print("Лице:", area_triangle(a, b))

else:
    print("Невалиден избор")
