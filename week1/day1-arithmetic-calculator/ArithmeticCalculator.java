import java.util.Scanner;

/**
 * Task 3: Arithmetic Calculator
 * Reads two numbers from the user and performs addition, subtraction,
 * multiplication, and division, printing each result with a clear label.
 */
public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Enter second number: ");
        double num2 = Double.parseDouble(scanner.nextLine().trim());

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println();
        System.out.println("---------- Results ----------");
        System.out.println("Addition       : " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction    : " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication : " + num1 + " * " + num2 + " = " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division       : " + num1 + " / " + num2 + " = " + quotient);
        } else {
            System.out.println("Division       : Undefined (cannot divide by zero)");
        }

        scanner.close();
    }
}
