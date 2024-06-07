# V = π * r2 * h
import math

s = input().split(',')
s = [int(x) for x in s]
r1 = s[0] / 10
h1 = s[1] / 10
r2 = s[2] / 10
h2 = s[3] / 10

V = [round(math.pi * r1**2 * h1, 2), round(math.pi * r2**2 * h2, 2)]
if V[0] > V[1]:
    print("The first cylinder has a bigger volume.")
elif V[0] < V[1]:
    print("The second cylinder has a bigger volume.")