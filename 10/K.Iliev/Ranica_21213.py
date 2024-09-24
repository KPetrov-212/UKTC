import itertools

all = []
vers = 0
passed = 0
endurance = int(input("Въведете свместимостта на раницата [kg]: "))

while True:
    N = int(input("Въведете броя предмети с които разполагате /от 2 до 5/: "))
    if 1 < N < 6:
        break

for i in range(N):
    while True:
        sub = int(input(f"Въведете теглото на предмет {i+1} /от 2 до 9/ [kg]: "))
        if 1 < sub < 10:
            all.append(sub)
            break
        else:
            print("kg - извън допустимата стойност")

permutations = list(itertools.permutations(all))
for curr_permutaion in permutations:
    vers+=1
    backpack = endurance
    count = 0
    statistics = []
    for element in curr_permutaion:
        while(backpack >= element):
            backpack -= element
            count += 1
        statistics.append(count)
        count = 0
    print(f"\n>>> Вариант {vers} на масива с предметите: {list(curr_permutaion)} <<<")

    if backpack == 0:
        passed += 1
        print(f"\n\t* * * Задачата ИМА решение * * * \n\tМасива с предметите: {list(curr_permutaion)} \n\tМасива за статистика: {statistics} \n\tВ Раницата остават : {backpack} кг")
    else:
        print(f"\n\t* * * Задачата НЯМА решение * * *\n\tВ Раницата остават : {backpack} кг")

print(f"\nБяха създадени {len(permutations)} варианта/пермутации/ на масива ! \n")
print(f"Намерени са {passed} решения !")