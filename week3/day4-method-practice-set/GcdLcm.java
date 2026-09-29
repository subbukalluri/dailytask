import java.util.Scanner;

/**
 * Method Practice 1: GCD and LCM using methods.
 */
public class GcdLcm {

    static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter second number: ");
        int second = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("GCD = " + gcd(first, second));
        System.out.println("LCM = " + lcm(first, second));
    }
}
