import java.util.Scanner;

/**
 * Task 4: String Comparison
 * Compares two strings with equals, equalsIgnoreCase, and compareTo.
 */
public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        System.out.println("equals()           : " + first.equals(second));
        System.out.println("equalsIgnoreCase() : " + first.equalsIgnoreCase(second));

        int result = first.compareTo(second);
        System.out.println("compareTo()        : " + result);

        if (result == 0) {
            System.out.println("Both strings are exactly the same.");
        } else if (result < 0) {
            System.out.println("\"" + first + "\" comes BEFORE \"" + second + "\" alphabetically.");
        } else {
            System.out.println("\"" + first + "\" comes AFTER \"" + second + "\" alphabetically.");
        }
    }
}
