beer = 200
wine = 300
dvr_b = 0
ord_b = 0
dvr_w = 0
ord_w = 0

while True:
    s = input()
    if s == 'END':
        print(f"\nWines: {wine}\nDeliveries: {dvr_w}\nOrders: {ord_w}\nBeers: {beer}\nDeliveries: {dvr_b}\nOrder: {ord_b}")
        exit()
    lista = s.split(' ')
    activity = int(lista[1])
    if activity >= 0:
        if lista[0] == 'Beers:':
            beer += activity
            dvr_b += 1
        elif lista[0] == 'Wines:':
            wine += activity
            dvr_w += 1
    elif activity < 0:
        if lista[0] == 'Beers:':
            beer += activity
            ord_b += 1
        elif lista[0] == 'Wines:':
            wine += activity
            ord_w += 1