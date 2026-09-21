/**
 * Task 1: Right Triangle Pattern
 * Uses nested loops to print a right triangle star pattern.
 */
public class RightTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop controls the row; inner loop controls the stars printed in that row.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
