operation = input("Enter operation [ |, &, ^, <<, >>, ~]: ")
if operation == "~":
    a = int(input("Enter a: "))
    print(f"Operation: ~{a}\nResult: ", ~a)
else:
    a, b = int(input("Enter a: ")), int(input("Enter b: "))

    if operation == "|":
        print(f"Operation: {a} | {b}\nResult: ", a | b)
    elif operation == "&":
        print(f"Operation: {a} & {b}\nResult: ", a & b)
    elif operation == "^":
        print(f"Operation: {a} ^ {b}\nResult: ", a ^ b)
    elif operation == "<<":
        print(f"Operation: {a} << {b}\nResult: ", a << b)
    elif operation == ">>":
        print(f"Operation: {a} >> {b}\nResult: ", a >> b)