import java.util.Scanner;

/**
 * Task 3: Prime Number Check
 * Determines whether a given number is prime.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // 0, 1, and negative numbers are not prime
        } else {
            // Only need to check divisors up to the square root of the number.
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }

        scanner.close();
    }
}
