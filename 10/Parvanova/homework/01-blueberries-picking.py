days = int(input("Enter the number of days to pick blueberries: "))

total_per_day = []
pickers_per_day = []
total_blueberries_all_days = 0.0

for day in range(1, days + 1):
    user_input = input(f"Enter the kilos of blueberries for every picker {day}: ").split(', ')
    
    berries = [float(x) for x in user_input]
    valid_berries = [min(10.0, x) for x in berries]

    total_blueberries_all_days += sum(valid_berries)
    total_per_day.append(sum(valid_berries))
    
    pickers = len(user_input)    
    pickers_per_day.append(pickers)
    
    average_blueberries_day = sum(valid_berries) / len(valid_berries)
    
    print(f"Day {day}: {pickers} blueberry pickers -> average: {average_blueberries_day:.2f} kg")

print(f"Total blueberries: {total_blueberries_all_days:.2f} kg")

day_min_blueberries = total_per_day.index(min(total_per_day)) + 1

print(f"The least blueberries were collected during day {day_min_blueberries}")