import java.util.Scanner;

/**
 * Task 1: Mini Console Tool
 * Combines methods and arrays into one small menu-driven utility.
 */
public class MiniConsoleTool {

    // ---------- Number helpers ----------
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // ---------- Array helpers ----------
    static int[] readArray(Scanner scanner) {
        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        return numbers;
    }

    static int sum(int[] numbers) {
        int total = 0;
        for (int value : numbers) {
            total += value;
        }
        return total;
    }

    static int max(int[] numbers) {
        int largest = numbers[0];
        for (int value : numbers) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    static void printReversed(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("===== MINI CONSOLE TOOL =====");
            System.out.println("1. Prime check");
            System.out.println("2. Factorial");
            System.out.println("3. Array sum");
            System.out.println("4. Array maximum");
            System.out.println("5. Reverse an array");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int primeInput = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println(primeInput + (isPrime(primeInput) ? " is Prime." : " is NOT Prime."));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factInput = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Factorial = " + factorial(factInput));
                    break;
                case 3:
                    System.out.println("Sum = " + sum(readArray(scanner)));
                    break;
                case 4:
                    System.out.println("Maximum = " + max(readArray(scanner)));
                    break;
                case 5:
                    System.out.print("Reversed: ");
                    printReversed(readArray(scanner));
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
