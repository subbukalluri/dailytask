import java.util.Scanner;

/**
 * Task 4: Sum of Digits
 * Reads a number and calculates the total of its digits using loop logic.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // extract the last digit
            sum += digit;
            number = number / 10;    // drop the last digit
        }

        System.out.println("Sum of digits of " + original + " is: " + sum);

        scanner.close();
    }
}
