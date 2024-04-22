s = "Hello, Pravets 2022!"

d_counter = 0
l_counter = 0
u_counter = 0
o_counter = 0

for char in s:
    if ord(char) >= 48 and ord(char) <= 57:
        d_counter += 1
    elif ord(char) >= 97 and ord(char) <= 122:
        l_counter += 1
    elif ord(char) >= 65 and ord(char) <= 90:
        u_counter += 1
    else:
        o_counter += 1


print(f"Digits count: {d_counter}")
print(f"Lowercase letters count: {l_counter}")
print(f"Uppercase letters count: {u_counter}")
print(f"Other symbols count: {o_counter}")