def is_palindrome(number):
    text = str(number)
    if text == text[::-1]:
        return 1
    else:
        return 0


num = int(input("Въведи число: "))
print(is_palindrome(num))
