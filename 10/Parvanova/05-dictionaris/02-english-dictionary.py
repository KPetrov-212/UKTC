english_dictionary = {}

while True:
    word = input()
    if word == "":
        break

    meaning = input().split("/")
    english_dictionary[word] = meaning

for word, meaning in english_dictionary.items():
    print(f"{word} - {', '.join(meaning)}")