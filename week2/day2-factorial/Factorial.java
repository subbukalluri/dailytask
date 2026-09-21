import java.util.Scanner;

/**
 * Task 2: Factorial Program
 * Calculates the factorial of a number using both a for loop and a while loop,
 * with comments comparing the two approaches.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        // ---------- Using a for loop ----------
        // A for loop is a good fit here because we know exactly how many
        // iterations are needed (from 1 to number) before the loop starts.
        long factorialFor = 1;
        for (int i = 1; i <= number; i++) {
            factorialFor *= i;
        }

        // ---------- Using a while loop ----------
        // A while loop works just as well, but the counter must be declared
        // and updated manually, which makes the loop control less compact.
        long factorialWhile = 1;
        int counter = 1;
        while (counter <= number) {
            factorialWhile *= counter;
            counter++;
        }

        System.out.println("Factorial of " + number + " (for loop)   : " + factorialFor);
        System.out.println("Factorial of " + number + " (while loop) : " + factorialWhile);

        scanner.close();
    }
}
