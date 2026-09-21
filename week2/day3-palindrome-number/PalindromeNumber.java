import java.util.Scanner;

/**
 * Task 1: Palindrome Number
 * Reverses the given number and compares it with the original value
 * to check whether the number is a palindrome.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }

        scanner.close();
    }
}
