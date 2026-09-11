import java.util.Scanner;

/**
 * Task 4: Menu-Driven Program (switch-case)
 * ---------------------------------------------------
 * Builds a small menu using switch-case that lets the user
 * either:
 *   A) Perform a basic arithmetic operation (+, -, *, /), or
 *   B) Convert a unit of length (kilometers <-> miles)
 *
 * switch-case vs if-else ladder:
 * switch-case is cleaner than a long if-else ladder when we
 * are comparing ONE variable against several fixed/discrete
 * values (like menu option 1, 2, 3...). Each "case" is a
 * possible value of that variable, and "break" stops
 * execution from falling through into the next case.
 */
public class SwitchMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========= Main Menu =========");
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. Unit Conversion (km <-> miles)");
        System.out.print("Choose an option (1 or 2): ");
        int mainChoice = sc.nextInt();

        switch (mainChoice) {

            case 1: {
                // ---- Arithmetic operations sub-menu ----
                System.out.println("\n-- Arithmetic Operations --");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.print("Choose an operation (1-4): ");
                int opChoice = sc.nextInt();

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (opChoice) {
                    case 1:
                        System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                        break; // break stops fall-through to the next case
                    case 2:
                        System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                        break;
                    case 3:
                        System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                        break;
                    case 4:
                        // Guard against division by zero before dividing
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                        }
                        break;
                    default:
                        // default runs when opChoice matches none of the cases above
                        System.out.println("Invalid operation choice!");
                }
                break;
            }

            case 2: {
                // ---- Unit conversion sub-menu ----
                System.out.println("\n-- Unit Conversion --");
                System.out.println("1. Kilometers to Miles");
                System.out.println("2. Miles to Kilometers");
                System.out.print("Choose a conversion (1-2): ");
                int convChoice = sc.nextInt();

                switch (convChoice) {
                    case 1:
                        System.out.print("Enter distance in kilometers: ");
                        double km = sc.nextDouble();
                        double miles = km * 0.621371; // conversion factor
                        System.out.printf("%.2f km = %.2f miles%n", km, miles);
                        break;
                    case 2:
                        System.out.print("Enter distance in miles: ");
                        double milesInput = sc.nextDouble();
                        double kmResult = milesInput / 0.621371; // reverse conversion
                        System.out.printf("%.2f miles = %.2f km%n", milesInput, kmResult);
                        break;
                    default:
                        System.out.println("Invalid conversion choice!");
                }
                break;
            }

            default:
                // Reached when mainChoice is neither 1 nor 2
                System.out.println("Invalid main menu choice!");
        }

        sc.close();
    }
}
