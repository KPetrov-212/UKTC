import random
li = random.sample(range(1, 101), 4)
print(li)
li.insert(2, li[1] + li[2])
print(li)