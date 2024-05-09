class Computer:

    tip = "Laptop"
    
    def __init__(self, marka, model, cena):
        self.marka = marka
        self.model = model
        self.cena = cena
    
    def __str__(self):
        return f'{self.tip} - {self.marka}, {self.model} : {self.cena}'

comp1 = Computer('Asus', 'G14', 1000)
comp2 = Computer('Lenovo', 'Legion', 1250)

comp1.cena *= 1.82
comp2.cena *= 1.82

print(comp1)
print(comp2)