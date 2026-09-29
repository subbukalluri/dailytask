import java.util.Scanner;

/**
 * Weekly Test 4: Methods and Arrays
 * Covers methods, arrays, searching, sorting, and array-based logic.
 */
public class MethodsArraysTest {

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

    static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
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

    static int min(int[] numbers) {
        int smallest = numbers[0];
        for (int value : numbers) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    static void printArray(String label, int[] numbers) {
        System.out.print(label);
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner);

        printArray("Array: ", numbers);
        System.out.println("Sum     = " + sum(numbers));
        System.out.println("Average = " + (double) sum(numbers) / numbers.length);
        System.out.println("Maximum = " + max(numbers));
        System.out.println("Minimum = " + min(numbers));

        System.out.print("Enter a number to search: ");
        int key = Integer.parseInt(scanner.nextLine().trim());
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println(key + " is NOT present.");
        } else {
            System.out.println(key + " found at index " + index + ".");
        }

        bubbleSort(numbers);
        printArray("Sorted: ", numbers);
    }
}
