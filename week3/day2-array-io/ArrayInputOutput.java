import java.util.Scanner;

/**
 * Task 1: Array Input and Output
 * Reads values into an array and prints them with a loop.
 */
public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
