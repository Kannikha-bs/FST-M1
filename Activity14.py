# Ask the user for how many Fibonacci numbers to generate
n = int(input("How many Fibonacci numbers do you want? "))

# First two numbers of the Fibonacci sequence
a, b = 1, 1

# List to store the sequence
fib_sequence = []

for i in range(n):
    fib_sequence.append(a)
    a, b = b, a + b

print("Fibonacci Sequence:", fib_sequence)