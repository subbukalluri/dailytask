/**
 * Task 1: While Loop Practice
 * Uses a while loop to print numbers in ascending order, then builds
 * a countdown example using the same loop structure.
 */
public class WhileLoopPractice {
    public static void main(String[] args) {
        // ---------- Ascending count using while ----------
        System.out.println("Counting up:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++; // update happens inside the loop body, unlike a for loop
        }
        System.out.println();

        // ---------- Countdown using while ----------
        System.out.println("Countdown:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.print(countdown + " ");
            countdown--;
        }
        System.out.println("Liftoff!");
    }
}
