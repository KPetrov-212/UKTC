n = int(input())
digits = tuple(int(d) for d in str(abs(n)))
forward = digits
backward = tuple(reversed(digits))
print(forward)
print(backward)