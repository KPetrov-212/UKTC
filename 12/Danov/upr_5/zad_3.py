def count_characters(input_string):
    char_count = {}
    for char in input_string:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
    return char_count

user_input = input("Enter a string: ")
result = count_characters(user_input)

print(", ".join(f"{key}:{value}" for key, value in result.items()))