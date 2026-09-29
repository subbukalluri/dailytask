import java.util.Scanner;

/**
 * String Practice 3: Find the longest word in a sentence.
 */
public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("No words entered.");
            return;
        }

        String[] words = sentence.split("\\s+");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest + " (" + longest.length() + " letters)");
    }
}
