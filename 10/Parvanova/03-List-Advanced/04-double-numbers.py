#input_numbers = input().split('|')
numbers = list(map(int, input().split('|')))
key_number = int(input())

double_numbers = list(map(lambda num: num * num, numbers))
flter_numbers = list(filter(lambda num: num >= key_number, double_numbers))

print(numbers)
print(double_numbers)
print(flter_numbers)