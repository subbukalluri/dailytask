import java.util.Scanner;

/**
 * Task 3: Temperature Converter
 * ---------------------------------------------------
 * Displays a menu that lets the user convert:
 *   1) Celsius to Fahrenheit   -> F = (C * 9/5) + 32
 *   2) Fahrenheit to Celsius   -> C = (F - 32) * 5/9
 *
 * The menu choice is handled with an if-else ladder here;
 * see Task 4 (day4-switch-menu) for the switch-case version
 * of a similar menu-driven structure.
 */
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Celsius -> Fahrenheit conversion
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9.0 / 5.0) + 32;

            System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);

        } else if (choice == 2) {
            // Fahrenheit -> Celsius conversion
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = (fahrenheit - 32) * 5.0 / 9.0;

            System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", fahrenheit, celsius);

        } else {
            // Any choice other than 1 or 2 is invalid
            System.out.println("Invalid option! Please choose 1 or 2.");
        }

        sc.close();
    }
}
