class Person:
    def __init__(self, first_name, last_name, age, nationality):
        self.first_name = first_name
        self.last_name = last_name
        self.age = age
        self.nationality = nationality

    def print_info(self):
        print(self.first_name, self.last_name, "-", self.nationality)

# Example usage made by AI
person1 = Person("Иван", "Иванов", 20, "българин")
person2 = Person("Anna", "Smith", 25, "англичанка")

person1.print_info()
person2.print_info()
