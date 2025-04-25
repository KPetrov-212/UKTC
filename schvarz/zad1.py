def has_duplicates(lst):
    n = max(set(lst), key=lst.count)
    return lst.count(n) > 1

a = input("Enter text: ")
lst = list(a.lower())
print("Has duplicates:", has_duplicates(lst))