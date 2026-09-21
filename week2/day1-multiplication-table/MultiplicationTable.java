import java.util.Scanner;

/**
 * Task 3: Multiplication Table
 * Reads a number and prints its multiplication table using a loop.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Multiplication table for " + number + ":");
        // Print number x i for i from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
