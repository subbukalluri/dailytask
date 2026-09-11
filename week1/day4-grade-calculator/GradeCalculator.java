import java.util.Scanner;

/**
 * Task 1: Grade Calculator
 * ---------------------------------------------------
 * Reads a student's marks (out of 100) and assigns a
 * grade using an if-else ladder.
 *
 * Grading scale used:
 *   90 - 100  -> A+
 *   80 - 89   -> A
 *   70 - 79   -> B
 *   60 - 69   -> C
 *   50 - 59   -> D
 *   below 50  -> F (Fail)
 *
 * How the if-else ladder works:
 * We check conditions from the HIGHEST range down to the
 * LOWEST. The moment a condition is true, that block runs
 * and the rest of the ladder is skipped. This is why order
 * matters - if we checked "marks >= 50" first, every score
 * above 50 would incorrectly get a "D".
 */
public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks obtained (0-100): ");
        int marks = sc.nextInt();

        // Basic input validation - marks should be within 0-100
        if (marks < 0 || marks > 100) {
            // Invalid input case, handled first so the ladder
            // below can safely assume a valid range.
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else if (marks >= 90) {
            // Highest range checked first
            System.out.println("Grade: A+ (Outstanding)");
        } else if (marks >= 80) {
            // Reached only if marks < 90 AND marks >= 80
            System.out.println("Grade: A (Excellent)");
        } else if (marks >= 70) {
            // Reached only if marks < 80 AND marks >= 70
            System.out.println("Grade: B (Very Good)");
        } else if (marks >= 60) {
            // Reached only if marks < 70 AND marks >= 60
            System.out.println("Grade: C (Good)");
        } else if (marks >= 50) {
            // Reached only if marks < 60 AND marks >= 50
            System.out.println("Grade: D (Pass)");
        } else {
            // None of the above conditions matched -> below 50
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
