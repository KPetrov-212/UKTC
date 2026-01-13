class Car:
    def __init__(self, brand, model, year, colour):
        self.brand = brand
        self.model = model
        self.year = year
        self.colour = colour

    def carinfo(self):
        print(self.brand, self.model, "-", self.year)

# Example usage made by AI
car1 = Car("BMW", "M3", 2020, "black")
car2 = Car("Audi", "A4", 2018, "white")

car1.carinfo()
car2.carinfo()
