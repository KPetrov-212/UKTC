class Person:
    def __init__(self, name, age):
        self.__name = name
        self.__age = age
    def get_name(self):
        # self.__name = 'ABC'
        return self.__name
    
    def get_age(self):
        return self.__age
    
person1 = Person("Tom", 41)
print(person1.get_name())
print(person1.get_age())
person1.age = 60
print(person1.get_age())