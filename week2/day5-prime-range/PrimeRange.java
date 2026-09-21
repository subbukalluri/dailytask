import java.util.Scanner;

/**
 * Task 1: Prime Numbers in a Range
 * Displays all prime numbers within a user-defined range.
 */
public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter the end of the range: ");
        int end = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        scanner.close();
    }

    // Checks whether a single number is prime.
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
