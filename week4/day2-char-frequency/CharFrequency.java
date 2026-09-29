import java.util.Scanner;

/**
 * Task 1: Character Frequency
 * Counts how many times a chosen character appears in a sentence.
 */
public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the character to count: ");
        char target = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("'" + target + "' appears " + count + " time(s).");
    }
}
