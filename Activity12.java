package Activities_kanni;

public class Activity12 {
    public static void main(String[] args) {

        // 1. Lambda expression without body (expression style)
        Addable ad1 = (num1, num2) -> num1 + num2;

        // 2. Lambda expression with body (block style)
        Addable ad2 = (num1, num2) -> {
            int sum = num1 + num2;
            return sum;
        };

        // Test both
        int result1 = ad1.add(10, 20);
        int result2 = ad2.add(15, 25);

        System.out.println("Result from ad1 (expression style): " + result1);
        System.out.println("Result from ad2 (block style): " + result2);
    }
}
