import java.util.Scanner;

/**
 * Task 1: Reverse Array
 * Displays the elements of an array in reverse order.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        System.out.print("Original: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Walk from the last index down to 0.
        System.out.print("Reversed: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
