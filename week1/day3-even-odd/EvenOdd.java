import java.util.Scanner;

/**
 * Task 1: Even or Odd
 * Reads a number and determines whether it is even or odd using the modulus operator.
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        // The modulus operator (%) gives the remainder of division by 2.
        // A remainder of 0 means the number is evenly divisible by 2 (even),
        // any other remainder means it is odd.
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        scanner.close();
    }
}
