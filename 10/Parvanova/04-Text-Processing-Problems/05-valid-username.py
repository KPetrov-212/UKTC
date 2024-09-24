def validation(x):
    if 5 <= len(x) <= 15 and x.isalpha() and ("_" in x or "." in x):
        return x
    else:
        return None

if __name__ == "__main__":
    names = input("Enter names separated by commas: ").split(', ')
    valid_names = [x for x in (validation(name) for name in names) if x is not None]

    print("Valid names:", valid_names)
