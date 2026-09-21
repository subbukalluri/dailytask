import java.util.Scanner;

/**
 * Task 4: Fibonacci Series
 * Generates the Fibonacci series for n terms and prints the values in order.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = Integer.parseInt(scanner.nextLine().trim());

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series with " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        scanner.close();
    }
}
