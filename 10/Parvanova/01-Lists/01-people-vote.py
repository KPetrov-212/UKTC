list = [5, 18, 1, 33, 4, 52]
listAdults = []
listChildren = []
for i in list:
    if i > 17:
        listAdults.append(i)
    else:
        listChildren.append(i)
print("Adults", listAdults)
print("Children", listChildren)
print("Count of children: ", len(listChildren))
print("Count of adults: ", len(listAdults))
print("Average age of adults: ", round(sum(listAdults) / len(listAdults)))



