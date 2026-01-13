class Student:
    def __init__(self, first_name, last_name, faculty_number, grades):
        self.first_name = first_name
        self.last_name = last_name
        self.faculty_number = faculty_number
        self.grades = grades

    def average_grade(self):
        return sum(self.grades) / len(self.grades)

# Example usage made by AI
student1 = Student("Петър", "Петров", "F12345", [5, 6, 4, 6])
student2 = Student("Мария", "Иванова", "F67890", [6, 6, 5, 6])

print(student1.first_name, "среден успех:", student1.average_grade())
print(student2.first_name, "среден успех:", student2.average_grade())
