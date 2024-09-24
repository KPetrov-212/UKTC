callendar = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
year = int(input("Year: "))
day = int(input("Day: "))

counter = 0     # Общ брой дни от началото на годината до КРАЯ на месеца, в който е {day}

# -- fuctions -- #
def gregorian(year):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        callendar[1] = 29
    elif (day >= 366):
        print("Year's day out of bounds -> max 352 for this year")
        exit()

def julian(year):
    if year % 4 == 0:
        callendar[1] = 29
    elif (day >= 366):
        print("Year's day out of bounds -> max 352 for this year")
        exit()
#/ -- fuctions -- #

# -- year check -- #
if year > 2700 or year < 1700:
    print("Year out of bounds -> must be (1700 to 2700)")
    exit()
elif year == 1916 and day > 91:
    if day <= 352:
        day += 13
        gregorian(year)
    else:
        print("Year's day out of bounds -> max 352 for this year")
        exit()
elif year <= 1916:
    julian(year)
else:
    gregorian(year)
#/ -- year check -- #

# -- date -- #
for month_index, days_in_month  in enumerate(callendar):
    counter += days_in_month 
    if counter >= day:
        current_month = month_index + 1
        days_of_month = days_in_month 
        break
#/ -- date -- #
day_in_month = days_of_month - (counter - day)

print("{:02d}.{:02d}.{}".format(day_in_month, current_month, year))