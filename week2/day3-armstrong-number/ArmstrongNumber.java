import java.util.Scanner;

/**
 * Task 2: Armstrong Number
 * Breaks the number into digits and checks whether it is an Armstrong number
 * (the sum of each digit raised to the power of the digit count equals the number).
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        int original = number;
        int digitCount = String.valueOf(number).length();
        int sum = 0;

        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digitCount);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
