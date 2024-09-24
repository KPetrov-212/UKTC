class Student:
    def __init__(self, year=1):
        self.year = year

    @property
    def year(self):
        return self.__year
    
    @year.setter
    def year(self, year):
        if year > 4:
            self.__year = "master"
        else:
            self.__year = "bachelor"

student1 = Student(5)
print(student1.year)
student1.year = 2
print(student1.year)