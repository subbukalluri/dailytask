/**
 * Task 1: For Loop Basics
 * Uses a for loop to print numbers in ascending and descending order,
 * with comments explaining each part of the loop control.
 */
public class ForLoopBasics {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        // ---------- Ascending order ----------
        // Loop control: initialization (i = start), condition (i <= end), update (i++)
        System.out.println("Ascending order:");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- Descending order ----------
        // Loop control: initialization (i = end), condition (i >= start), update (i--)
        System.out.println("Descending order:");
        for (int i = end; i >= start; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
