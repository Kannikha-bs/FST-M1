user_input = input("Enter numbers separated by spaces: ")

numbers = list(map(int, user_input.split()))

total = sum(numbers)

print("The sum of the list is:", total)
