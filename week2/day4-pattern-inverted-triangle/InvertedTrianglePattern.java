/**
 * Task 2: Inverted Triangle Pattern
 * Uses nested loops to print an inverted triangle star pattern.
 */
public class InvertedTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop counts down; inner loop prints one fewer star each row.
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
