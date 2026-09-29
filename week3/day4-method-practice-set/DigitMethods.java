import java.util.Scanner;

/**
 * Method Practice 3: Digit operations using methods.
 */
public class DigitMethods {

    static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    static boolean isArmstrong(int number) {
        int digits = countDigits(number);
        int temp = number;
        int total = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int powered = 1;
            for (int i = 0; i < digits; i++) {
                powered *= digit;
            }
            total += powered;
            temp /= 10;
        }
        return total == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Number of digits = " + countDigits(number));
        System.out.println("Sum of digits    = " + sumOfDigits(number));
        System.out.println("Armstrong number = " + isArmstrong(number));
    }
}
