text= input()
digits = ""
letters = ""
other_symbols = ""

for char in text:
    if char.isdigit():
        digits += char
    elif char.isalpha():
        letters += char
    else:
        other_symbols += char

print(digits)
print(letters)
print(other_symbols)
