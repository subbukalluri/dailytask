import java.util.Scanner;

/**
 * Task 1: String Reverse
 * Reverses a string using loop logic.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
