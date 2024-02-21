listDef = [6, 3, -1, 25, 8, 72, -10]
listNew = []
inp = input("Enter: ")
match inp:
    case "positive":
        for i in listDef:
            if i >= 0:
                listNew.append(i)
        print(listNew)
    case "negative":
        for i in listDef:
            if i < 0:
                listNew.append(i)
        print(listNew)
    case "even":
        for i in listDef:
            if i % 2 == 0:
                listNew.append(i)
        print(listNew)
    case "odd":
        for i in listDef:
            if not i % 2 == 0:
                listNew.append(i)
        print(listNew)