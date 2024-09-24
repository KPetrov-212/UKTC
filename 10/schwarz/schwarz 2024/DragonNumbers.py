from itertools import permutations

draggon = False
s = input("Enter a number: ")

perms = [''.join(p) for p in permutations(s)]

if len(s) < 3:
    print("Normal Number")
elif len(s) % 2 == 0:
    for p in perms:
        first_half  = int(p[:len(p)//2])
        second_half = int(p[len(p)//2:])
        result = first_half * second_half
        if result == int(s):
            print("True Dragon")
            draggone = True
            exit()  
else:
    for p in perms:
        first_half  = int(p[:len(p)//2])
        second_half = int(p[(len(p)//2):])

        dub_first_half  = int(p[:len(p)//2])
        dub_second_half = int(p[(len(p)//2) +1:])

        result = first_half * second_half
        dub_result = dub_first_half * dub_second_half

        if result or dub_result == int(s):
            print("Pseudodragon")
            draggone = True
            exit()
if not draggon:
    print("Normal Number")
