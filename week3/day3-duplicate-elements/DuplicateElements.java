import java.util.Scanner;

/**
 * Task 4: Duplicate Elements
 * Identifies and prints the duplicate values in an array.
 */
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        System.out.println("Duplicate elements:");
        boolean foundAny = false;

        for (int i = 0; i < size; i++) {
            // Skip values that were already reported earlier in the array.
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }

            // Look for the same value later in the array.
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    foundAny = true;
                    break;
                }
            }
        }

        if (!foundAny) {
            System.out.println("No duplicates found.");
        }
    }
}
