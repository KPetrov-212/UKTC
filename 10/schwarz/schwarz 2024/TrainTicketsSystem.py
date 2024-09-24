dict = {}
earnings = []
n = int(input("Destinations: "))
for i in range(n):
    s = input().split(' ')
    res = [i for i in s[1] if i.isdigit() or i == '.']
    res = ''.join(res)
    dict[s[0]] = float(res)

for city, price in dict.items():
    people = []
    total = 0
    print(f"\n{city}:")
    while True:
        discount = 0
        s = input()
        if s == 'NEXT DESTINATION':
            break
        else:
            s = s.split(' ')
            hour = s[1].split(':')
            hour = ''.join(hour)
            if int(hour) > 700 and int(hour) < 1900:
                pass
            else:
                discount += 5
            year = [i for i in s[0] if i.isdigit()]
            year = ''.join(year)
            if (int(year) >= 12 and int(year) <= 18) or int(year) > 64:
                discount += 10
            people.append(discount)
    if len(people) >= 4:
        for i in range(0, len(people)-1):
            people[i] += 5
    for j in people:
        if j > 0:
            total += price - ((price * j) / 100)
        else:
            total += price
    earnings.append(total)
print("\nNo more destinations left!")

counter = 0
for city in dict.keys():
    print(f"{city}: {earnings[counter]}bgn")
    counter += 1
        

        
# vat = number - (number * 20 / 100)