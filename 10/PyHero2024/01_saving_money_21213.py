money = [int(x) for x in input().split(', ')]

safe = [0 for x in range(int(input()))]

j = 0
for i in range(len(money)):
    if j == len(safe):
        j = 0
    safe[j] += money[i]
    j += 1

for item in safe:
    print(f"Purse {safe.index(item)+1} - {item:.2f}lv")