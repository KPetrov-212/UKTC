string = input("Enter the string: ")
searched_letter = input("Enter searched letter: ")
count_letter = 0
listOfLetters = [letter for letter in string]
for letter in listOfLetters:
    if letter == searched_letter:
        count_letter += 1
print(f"There are {count_letter} letters {searched_letter} in the text")