class Animal:
    def __init__(self, species):
        self.species = species

    def make_sound(self):
        print("Some generic sound")

class Dog(Animal):
    def __init__(self, breed, name):
        # Call the constructor of the parent class
        super().__init__("Dog")
        self.breed = breed
        self.name = name

    def make_sound(self):
        print("Woof!")

# Creating instances
my_dog = Dog("Golden Retriever", "Buddy")

# Accessing attributes
print(my_dog.species)  # Output: Dog
print(my_dog.breed)    # Output: Golden Retriever
print(my_dog.name)     # Output: Buddy

# Calling methods
my_dog.make_sound()    # Output: Woof!