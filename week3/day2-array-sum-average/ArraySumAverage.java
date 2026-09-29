import java.util.Scanner;

/**
 * Task 2: Array Sum and Average
 * Calculates the sum and average of an integer array.
 */
public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / size;

        System.out.println("Sum     = " + sum);
        System.out.println("Average = " + average);
    }
}
