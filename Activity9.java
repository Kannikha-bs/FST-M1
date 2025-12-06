package Activities_kanni;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        // 1. Create an ArrayList of Strings
        ArrayList<String> myList = new ArrayList<>();

        // 2. Add 5 names to the ArrayList
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Emma");

        // 3. Print all names using for loop
        System.out.println("All names in the list:");
        for (String name : myList) {
            System.out.println(name);
        }

        // 4. Retrieve the 3rd name (index 2)
        System.out.println("\n3rd name in the list: " + myList.get(2));

        // 5. Use contains() to check if a name exists
        String checkName = "Charlie";
        System.out.println("\nDoes the list contain '" + checkName + "'? " + myList.contains(checkName));

        // 6. Print size() of the ArrayList
        System.out.println("\nNumber of names in the list: " + myList.size());

        // 7. Remove a name and print size again
        myList.remove("Bob");
        System.out.println("After removing 'Bob', new size of the list: " + myList.size());
    }
}
