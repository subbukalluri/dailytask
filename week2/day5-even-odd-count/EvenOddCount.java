import java.util.Scanner;

/**
 * Task 2: Even and Odd Count
 * Counts how many even and odd numbers appear in a user-defined range.
 */
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter the end of the range: ");
        int end = Integer.parseInt(scanner.nextLine().trim());

        int evenCount = 0;
        int oddCount = 0;

        for (int number = start; number <= end; number++) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers : " + oddCount);

        scanner.close();
    }
}
