
my_list = [1, 2, 3, 4, 5]
print("List:", my_list)

# index()
index = my_list.index(3)
print("index() of elem (3):", index)

# append()
my_list.append(6)
print("append() elem (6):", my_list)

# extend()
my_list.extend([6, 7, 8])
print("extend() with (6, 7, 8):", my_list)  

# insert()
my_list.insert(2, 20)
print("insert() elem (20) on index (2):", my_list) 

# remove()
my_list.remove(3)
print("remove() index (3):", my_list) 

# count()
counter = my_list.count(6)
print("count() elem (6):", counter) 

# pop()
my_list.pop()
print(f"pop():", my_list ) 

# reverse()
my_list.reverse()
print("reverse():", my_list)

# sort()
my_list.sort()
print("sort():", my_list)

# copy()
copied_my_list = my_list.copy()
print("copy():", copied_my_list) 

# clear()
my_list.clear()
print("clear():", my_list)  
