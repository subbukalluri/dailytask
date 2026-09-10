import java.util.Scanner;

/**
 * Task 2: Positive, Negative, or Zero
 * Reads a number and classifies it as positive, negative, or zero using conditional statements.
 */
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = Double.parseDouble(scanner.nextLine().trim());

        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println(number + " is Zero.");
        }

        scanner.close();
    }
}
