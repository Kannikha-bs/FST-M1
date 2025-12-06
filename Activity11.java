package Activities_kanni;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {

        // 1. Create a Map with Integer keys and String values
        Map<Integer, String> colours = new HashMap<>();

        // 2. Add 5 random colours
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Yellow");
        colours.put(4, "Green");
        colours.put(5, "Purple");

        // Print the Map
        System.out.println("Original Map: " + colours);

        // 3. Remove one colour using remove()
        colours.remove(3);   // removing key 3 -> Yellow
        System.out.println("After removing key 3: " + colours);

        // 4. Check if colour 'Green' exists
        boolean hasGreen = colours.containsValue("Green");
        System.out.println("Does the Map contain 'Green'? " + hasGreen);

        // 5. Print size of the Map
        System.out.println("Size of Map: " + colours.size());
    }
}
