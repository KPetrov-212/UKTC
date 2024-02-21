my_string = input().split()
repeated_string = ""


for word in my_string:
    for i in word:
        repeated_string += word * len(i)
    #repeated_string += word * len(words)

print(repeated_string)