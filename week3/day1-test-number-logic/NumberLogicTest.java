import java.util.Scanner;

/**
 * Weekly Test 3: Number Logic
 * Covers loops, prime check, factorial, palindrome check, and pattern printing.
 */
public class NumberLogicTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        // 1. Prime check
        boolean isPrime = number > 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + (isPrime ? " is a Prime number." : " is NOT a Prime number."));

        // 2. Factorial (a long can hold up to 20!, so larger inputs are rejected)
        if (number < 0 || number > 20) {
            System.out.println("Factorial is only calculated for numbers from 0 to 20.");
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " = " + factorial);
        }

        // 3. Palindrome check (reverse the digits and compare)
        int temp = number;
        int reversed = 0;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(number + (number == reversed ? " is a Palindrome." : " is NOT a Palindrome."));

        // 4. Pattern printing: right triangle of stars
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Pattern:");
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
