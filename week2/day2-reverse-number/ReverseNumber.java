import java.util.Scanner;

/**
 * Task 3: Reverse a Number
 * Reverses a number digit by digit using modulus and division operations.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;      // modulus extracts the last digit
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;             // division removes the last digit
        }

        System.out.println("Original number : " + original);
        System.out.println("Reversed number : " + reversed);

        scanner.close();
    }
}
