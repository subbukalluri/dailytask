import java.util.Scanner;

/**
 * Task 2: Sort Array
 * Sorts an array in ascending order using manual comparison (bubble sort).
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        // Bubble sort: compare neighbours and swap when out of order.
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted (ascending): ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
