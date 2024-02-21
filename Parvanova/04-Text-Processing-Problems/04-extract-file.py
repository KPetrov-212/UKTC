path = input().split("\\")
print(path)
for element in path:
    if "." in element:
        file_name, file_extension = element.split(".")

        print(f"File name: {file_name}\nFile extension: {file_extension}")