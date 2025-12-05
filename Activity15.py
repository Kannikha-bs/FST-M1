try:
    print(x)   # x is not defined → NameError
except NameError:
    print("A NameError occurred! The variable you are trying to use is not defined.")

print("x hasn't been defined yet.")