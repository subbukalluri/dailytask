/**
 * Task 1: Utility Methods Program
 * Reusable methods for math and array operations.
 */
public class UtilityMethods {

    // ---------- Math utilities ----------
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

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

    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // ---------- Array utilities ----------
    static int sum(int[] numbers) {
        int total = 0;
        for (int value : numbers) {
            total += value;
        }
        return total;
    }

    static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
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

    static void printArray(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("isEven(10)   = " + isEven(10));
        System.out.println("isPrime(17)  = " + isPrime(17));
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("power(2, 8)  = " + power(2, 8));

        int[] data = {12, 45, 7, 23, 56, 89, 34};
        System.out.print("Array        = ");
        printArray(data);
        System.out.println("sum          = " + sum(data));
        System.out.println("average      = " + average(data));
        System.out.println("max          = " + max(data));
        System.out.println("min          = " + min(data));
    }
}
