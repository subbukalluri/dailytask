import java.util.Scanner;

/**
 * Task 2: Array Menu Application
 * Menu-based console program: display, search, reverse, and sort an array.
 */
public class ArrayMenuApp {

    static int[] numbers;

    static void readArray(Scanner scanner) {
        System.out.print("How many numbers? ");
        int size = Integer.parseInt(scanner.nextLine().trim());
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        System.out.println("Array stored.");
    }

    static void display() {
        System.out.print("Array: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    static void search(Scanner scanner) {
        System.out.print("Enter value to search: ");
        int key = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println(key + " found at index " + i + ".");
                return;
            }
        }
        System.out.println(key + " not found.");
    }

    static void reverse() {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println("Array reversed.");
        display();
    }

    static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted.");
        display();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readArray(scanner);

        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("===== ARRAY MENU =====");
            System.out.println("1. Display");
            System.out.println("2. Search");
            System.out.println("3. Reverse");
            System.out.println("4. Sort");
            System.out.println("5. Enter a new array");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    search(scanner);
                    break;
                case 3:
                    reverse();
                    break;
                case 4:
                    sort();
                    break;
                case 5:
                    readArray(scanner);
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
