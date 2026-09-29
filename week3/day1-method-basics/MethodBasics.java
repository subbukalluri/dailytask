/**
 * Task 1: Method Basics
 * Methods without a return value (void) and with a return value.
 */
public class MethodBasics {

    // No parameters, no return value
    static void greet() {
        System.out.println("Hello! Welcome to Java methods.");
    }

    // No return value, but prints a result
    static void printSquare(int number) {
        System.out.println("Square of " + number + " = " + (number * number));
    }

    // Returns an int
    static int getCube(int number) {
        return number * number * number;
    }

    // Returns a String
    static String getMessage() {
        return "This text was returned from a method.";
    }

    public static void main(String[] args) {
        greet();
        printSquare(5);

        int cube = getCube(3);
        System.out.println("Cube of 3 = " + cube);

        System.out.println(getMessage());
    }
}
