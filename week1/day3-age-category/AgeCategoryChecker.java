import java.util.Scanner;

/**
 * Task 4: Age Category Checker
 * Reads age input and classifies the person as Child, Teenager, Adult, or Senior
 * based on simple age-range rules.
 */
public class AgeCategoryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine().trim());

        String category;

        if (age < 0) {
            category = "Invalid age";
        } else if (age <= 12) {
            category = "Child";
        } else if (age <= 19) {
            category = "Teenager";
        } else if (age <= 59) {
            category = "Adult";
        } else {
            category = "Senior";
        }

        System.out.println("Age " + age + " is classified as: " + category);

        scanner.close();
    }
}
