dict = {
    'Monday' : 0,
    'Tuesday' : 0,
    'Wednesday' : 0,
    'Thursday' : 0,
    'Friday' : 0
}

for day in dict.keys():
    p = [int(x) for x in input().split('-')]
    l = len(p)
    dict[day] = f"{((sum(p) / (len(p) * 10)) * 100):.1f}%"

print(dict)