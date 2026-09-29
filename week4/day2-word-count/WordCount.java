import java.util.Scanner;

/**
 * Task 3: Word Count
 * Counts the total number of words in a sentence.
 */
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        int count = 0;
        if (!sentence.isEmpty()) {
            // Split on one or more spaces so extra spaces are handled.
            String[] words = sentence.split("\\s+");
            count = words.length;
        }

        System.out.println("Total words = " + count);
    }
}
