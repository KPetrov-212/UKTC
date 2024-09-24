string = input("Enter the string: ")
searched_letter = input("Enter searched letter: ")
listOfLetters = [letter for letter in string]
count_letter = string.count(searched_letter)
print(f"There are {count_letter} letters {searched_letter} in the text")