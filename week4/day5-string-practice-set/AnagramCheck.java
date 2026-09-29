import java.util.Scanner;

/**
 * String Practice 1: Check whether two strings are anagrams.
 */
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String first = scanner.nextLine().toLowerCase().replace(" ", "");
        System.out.print("Enter second word: ");
        String second = scanner.nextLine().toLowerCase().replace(" ", "");

        boolean isAnagram = first.length() == second.length();

        if (isAnagram) {
            int[] letterCounts = new int[26];
            for (int i = 0; i < first.length(); i++) {
                letterCounts[first.charAt(i) - 'a']++;
                letterCounts[second.charAt(i) - 'a']--;
            }
            for (int count : letterCounts) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println(isAnagram ? "The words are anagrams." : "The words are NOT anagrams.");
    }
}
