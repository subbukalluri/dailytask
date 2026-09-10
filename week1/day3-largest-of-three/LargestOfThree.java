import java.util.Scanner;

/**
 * Task 3: Largest of Three Numbers
 * Compares three user inputs and displays the largest value using if-else logic.
 */
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Enter second number: ");
        double b = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Enter third number: ");
        double c = Double.parseDouble(scanner.nextLine().trim());

        double largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is " + largest);

        scanner.close();
    }
}
