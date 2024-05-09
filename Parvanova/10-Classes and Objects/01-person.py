class Person:
    profession = 'teacher'

    def __init__(self, first_name, last_name, age = 0):
        self.first_name = first_name
        self.last_name = last_name
        self.age = age

    def __str__(self):
        return f'{self.first_name} {self.last_name} - {self.profession} - {self.age}'
    
person1 = Person('John', 'Doil', 37)
person2 = Person('Mila', 'Rows')

print(f'{person1.first_name} is {person1.age} year old')
print(f'{person2.first_name} is {person2.age} year old')

person1.age += 10
person1.last_name = 'Moq'

print(person1)