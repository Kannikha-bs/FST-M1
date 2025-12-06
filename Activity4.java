package Activities_kanni;

public class Activity4 {

    public static void main(String[] args) {

        // Initialize an array with numbers in random order
        int[] arr = {42, 15, 8, 23, 4, 16};

        // Display array before sorting
        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Insertion Sort Algorithm
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // Display array after sorting
        System.out.println("Array after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
