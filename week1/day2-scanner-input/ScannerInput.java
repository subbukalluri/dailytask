import java.util.Scanner;

/**
 * Task 1: Scanner Input
 * Reads name, age, and city from the user using the Scanner class,
 * then displays the collected values neatly.
 */
public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println();
        System.out.println("---------- Your Details ----------");
        System.out.printf("%-10s: %s%n", "Name", name);
        System.out.printf("%-10s: %d%n", "Age", age);
        System.out.printf("%-10s: %s%n", "City", city);
        System.out.println("-----------------------------------");

        scanner.close();
    }
}
