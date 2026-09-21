/**
 * Task 4: Alphabet Pattern
 * Uses nested loops to print an alphabet pattern such as A, AB, ABC.
 */
public class AlphabetPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop controls the row; inner loop prints letters starting from 'A'
        // up to the letter corresponding to the current row number.
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                char letter = (char) ('A' + j);
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
