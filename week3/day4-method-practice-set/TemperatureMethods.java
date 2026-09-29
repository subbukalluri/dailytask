import java.util.Scanner;

/**
 * Method Practice 2: Temperature conversion using methods.
 */
public class TemperatureMethods {

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = Double.parseDouble(scanner.nextLine().trim());
        System.out.println(celsius + " C = " + celsiusToFahrenheit(celsius) + " F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine().trim());
        System.out.println(fahrenheit + " F = " + fahrenheitToCelsius(fahrenheit) + " C");
    }
}
