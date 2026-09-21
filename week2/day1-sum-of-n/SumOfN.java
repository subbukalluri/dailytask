import java.util.Scanner;

/**
 * Task 2: Sum of N Numbers
 * Reads a number n and calculates the sum of all numbers from 1 to n using a loop.
 */
public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = Integer.parseInt(scanner.nextLine().trim());

        int sum = 0;
        // Add each number from 1 to n to the running total.
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}
