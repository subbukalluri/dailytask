import java.util.Scanner;

/**
 * Task 3: Logic Revision Set
 * Solves three additional number-logic problems to strengthen loop concepts:
 * sum of squares, greatest common divisor, and digit count.
 */
public class LogicRevisionSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------- Problem 1: Sum of squares from 1 to n ----------
        System.out.print("Enter n for sum of squares: ");
        int n = Integer.parseInt(scanner.nextLine().trim());
        long sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += (long) i * i;
        }
        System.out.println("Sum of squares from 1 to " + n + " is: " + sumOfSquares);

        // ---------- Problem 2: Greatest Common Divisor (GCD) of two numbers ----------
        System.out.print("Enter first number for GCD: ");
        int a = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter second number for GCD: ");
        int b = Integer.parseInt(scanner.nextLine().trim());
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + x);

        // ---------- Problem 3: Count total digits in a number ----------
        System.out.print("Enter a number to count its digits: ");
        int number = Integer.parseInt(scanner.nextLine().trim());
        int count = 0;
        int temp2 = Math.abs(number);
        if (temp2 == 0) {
            count = 1;
        } else {
            while (temp2 != 0) {
                count++;
                temp2 = temp2 / 10;
            }
        }
        System.out.println("Number of digits in " + number + " is: " + count);

        scanner.close();
    }
}
