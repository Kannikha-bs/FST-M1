list1 = [10, 20, 23, 11, 17]
list2 = [13, 43, 24, 36, 12]

new_list = []

# Add odd numbers from list1
for num in list1:
    if num % 2 != 0:
        new_list.append(num)

# Add even numbers from list2
for num in list2:
    if num % 2 == 0:
        new_list.append(num)

print("New List:", new_list)
