# bin
def zad1():
    num = input("Enter a number (bin): ")
    return f"Result in (dec): {int(num, 2)}"

def zad2():
    num = input("Enter a number (bin): ")
    num = int(num, 2)
    return f"Result in (oct): {oct(num)[2:]}"

def zad3():
    num = input("Enter a number (bin): ")
    num = int(num, 2)
    return f"Result in (hex): {hex(num)[2:]}"

# oct
def zad4():
    num = input("Enter a number (oct): ")
    return f"Result in (dec): {int(num, 8)}"

def zad5():
    num = input("Enter a number (oct): ")
    num = int(num, 8)
    return f"Result in (bin): {bin(num)[2:]}"

def zad6():
    num = input("Enter a number (oct): ")
    num = int(num, 8)
    return f"Result in (hex): {hex(num)[2:]}"

# dec 
def zad7():
    num = int(input("Enter a number (dec): "))
    return f"Result in (bin): {bin(num)[2:]}"

def zad8():
    num = int(input("Enter a number (dec): "))
    return f"Result in (oct): {oct(num)[2:]}"

def zad9():
    num = int(input("Enter a number (dec): "))
    return f"Result in (hex): {hex(num)[2:]}"

# hex
def zad10():
    num = input("Enter a number (hex): ")
    num = int(num, 16)
    return f"Result in (bin): {bin(num)[2:]}"


if __name__ == "__main__":
    zadachi = {
        "1": zad1,
        "2": zad2,
        "3": zad3,
        "4": zad4,
        "5": zad5,
        "6": zad6,
        "7": zad7,
        "8": zad8,
        "9": zad9,
        "10": zad10
    }

    result = zadachi[input("Enter zad (1-10): ")]()
    print(result)
