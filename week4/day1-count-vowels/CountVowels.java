import java.util.Scanner;

/**
 * Task 3: Count Vowels and Consonants
 * Counts vowels and consonants separately in a sentence.
 */
public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // only count letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels     = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
