import java.util.Scanner;

/**
 * Task 4: Linear Search
 * Searches for an element in an array and reports whether it is present.
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        System.out.print("Enter the number to search: ");
        int key = Integer.parseInt(scanner.nextLine().trim());

        int foundAt = -1; // -1 means not found
        for (int i = 0; i < size; i++) {
            if (numbers[i] == key) {
                foundAt = i;
                break;
            }
        }

        if (foundAt == -1) {
            System.out.println(key + " is NOT present in the array.");
        } else {
            System.out.println(key + " is present at index " + foundAt + ".");
        }
    }
}
