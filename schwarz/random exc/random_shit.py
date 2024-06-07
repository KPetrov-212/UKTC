s = input("Enter the str: ")

my_dict  = {}

for el in s:
    if el not in my_dict.keys():
        my_dict[el] = 1
    else:
        my_dict[el] += 1

my_list = list(my_dict.values())
counts = set(my_list)

if len(counts) == 2:
    for j in range(0, len(my_list) -1):
        copy_list = my_list.copy()
        copy_list[j] -= 1
        if copy_list[j] == 0:
            copy_list.remove(copy_list[j])
        if len(set(copy_list)) == 1:
            counts.remove(my_list[j])
            break
        
print(my_dict),
if len(counts) == 1 or sum(my_dict.values()) % len(my_dict.keys()) == 1:
    print("YES")
else: 
    print("NO")

# "abbccc" -> should be NO
# "abbbccc" -> should be YES
# "aaabbcc" -> should be YES