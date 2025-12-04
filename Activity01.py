# Ask for user's name and age
name = input("Enter your name: ")
age = int(input("Enter your age: "))

# Calculate the year they will turn 100
current_year = 2025
year_turn_100 = current_year + (100 - age)

# Print the message
print(f"Hello {name}, you will turn 100 years old in the year {year_turn_100}.")