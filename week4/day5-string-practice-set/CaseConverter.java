import java.util.Scanner;

/**
 * String Practice 2: Toggle the case of every letter in a sentence.
 */
public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32); // lowercase -> uppercase
            } else if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32); // uppercase -> lowercase
            } else {
                result += ch;
            }
        }

        System.out.println("Toggled case: " + result);
    }
}
