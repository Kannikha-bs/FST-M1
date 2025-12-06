package Activities_kanni;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {

        // 1. Create a HashSet
        HashSet<String> hs = new HashSet<>();

        // 2. Add 6 objects to the HashSet
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Dates");
        hs.add("Elderberry");
        hs.add("Fig");

        // 3. Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // 4. Remove an element
        hs.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hs);

        // 5. Try removing an element NOT present
        boolean removed = hs.remove("Grapes");  // will return false
        System.out.println("Trying to remove 'Grapes' (not present): " + removed);

        // 6. Use contains() to check if an item exists
        System.out.println("Does HashSet contain 'Banana'? " + hs.contains("Banana"));

        //
 }
  
}