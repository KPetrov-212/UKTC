number = int(input("Number of students: "))
student_list = {}
for i in range(number):
    student_list[i+1] = input("Student name: ")

for num, name in student_list.items():
    print(f"{num}. {name}")