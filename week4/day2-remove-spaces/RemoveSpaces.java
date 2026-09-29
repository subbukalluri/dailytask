import java.util.Scanner;

/**
 * Task 2: Remove Spaces
 * Removes every space from a sentence.
 */
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("Without spaces: " + result);
    }
}
