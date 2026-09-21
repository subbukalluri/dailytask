/**
 * Task 3: Number Pattern
 * Uses nested loops to print a number pattern such as 1, 12, 123, 1234.
 */
public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;

        // Outer loop controls the row; inner loop prints numbers 1 through i on that row.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
