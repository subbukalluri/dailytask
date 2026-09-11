import java.util.Scanner;

/**
 * Task 2: Simple Interest Calculator
 * ---------------------------------------------------
 * Reads Principal (P), Rate of interest (R), and Time (T)
 * from the user and computes Simple Interest using the
 * standard formula:
 *
 *      SI = (P * R * T) / 100
 *
 * where:
 *   P = Principal amount (the initial sum of money)
 *   R = Annual rate of interest (in percent)
 *   T = Time period (in years)
 *
 * We also compute the Total Amount payable:
 *      Total Amount = P + SI
 */
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Applying the Simple Interest formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Total amount = original principal + interest earned/owed
        double totalAmount = principal + simpleInterest;

        System.out.println("----------------------------------------");
        System.out.printf("Simple Interest = %.2f%n", simpleInterest);
        System.out.printf("Total Amount    = %.2f%n", totalAmount);

        sc.close();
    }
}
