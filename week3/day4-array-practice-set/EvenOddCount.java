import java.util.Scanner;

/**
 * Array Practice 1: Count even and odd numbers in an array.
 */
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int value : numbers) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers : " + oddCount);
    }
}
