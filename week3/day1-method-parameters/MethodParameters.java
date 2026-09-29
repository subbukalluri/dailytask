import java.util.Scanner;

/**
 * Task 2: Method Parameters
 * Methods that accept parameters: add, subtract, maximum, minimum.
 */
public class MethodParameters {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int maximum(int a, int b) {
        return a > b ? a : b;
    }

    static int minimum(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter second number: ");
        int second = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Addition    : " + add(first, second));
        System.out.println("Subtraction : " + subtract(first, second));
        System.out.println("Maximum     : " + maximum(first, second));
        System.out.println("Minimum     : " + minimum(first, second));
    }
}
