package Activities_kanni;

public class Activity2 {

    public static void main(String[] args) {

        // Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};

        int sum = 0;

        // Find all the 10's and add them
        for (int num : numbers) {
            if (num == 10) {
                sum += num;
            }
        }

        // Check if sum is exactly 30
        boolean result = (sum == 30);

        // Print the result
        System.out.println("Sum of all 10's = " + sum);
        System.out.println("Result: " + result);
    }
}

