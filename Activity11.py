# Dictionary of fruits and their prices
fruits = {
    "apple": 120,
    "banana": 40,
    "orange": 60,
    "mango": 150,
    "grapes": 90
}

# Ask the user for the fruit name
fruit_name = input("Enter the fruit you are looking for: ").lower()

# Check availability
if fruit_name in fruits:
    print(f"Yes, {fruit_name} is available and its price is ₹{fruits[fruit_name]}.")
else:
    print(f"Sorry, {fruit_name} is not available.")
