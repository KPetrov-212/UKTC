def craft(dict):
    counter = 0
    while dict['Sticks'] >= 2 and dict['Cobblestone'] >= 3:
        dict['Sticks'] -= 2
        dict['Cobblestone'] -= 3
        counter += 1
    return counter

if __name__ == '__main__':
    my_dict = {
    'Sticks' : 0,
    'Cobblestone' : 0
    }
    
    while True:
        s = input()
        if s == 'END':
            print(f'Amount of stone pickaxes: {craft(my_dict)}')
            
        elif s == 'Sticks':
            my_dict['Sticks'] += 1
        elif s == 'Cobblestone':
            my_dict['Cobblestone'] += 1
        elif s == 'Wood':
            my_dict['Sticks'] += 4


