s = "abbccc"

my_dict  = {}

for el in s:
    if el not in my_dict.keys():
        my_dict[el] = 1
    else:
        my_dict[el] += 1

if sum(my_dict.values()) % len(my_dict.keys()) == 0 or sum(my_dict.values()) % len(my_dict.keys()) == 1:
    print("YES")
else: 
    print("NO")

print(my_dict)

# "abbccc" -> should be NO but prints YES