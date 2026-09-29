/**
 * Task 2: Refactor Method Names
 *
 * Naming conventions applied to this week's method files:
 *  - Methods use camelCase verbs (calculateSum, findMaximum).
 *  - Boolean methods start with "is" (isPrime, isEven).
 *  - Parameters have meaningful names (numbers, firstNumber) instead of a, b, arr.
 *
 * Example renames:  add() -> calculateSum(),  mx() -> findMaximum(),  chk() -> isPrime()
 */
public class RefactoredMethods {

    /** Returns the sum of two integers. */
    static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /** Returns the larger of two integers. */
    static int findMaximum(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }

    /** Returns true when the number is divisible only by 1 and itself. */
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /** Returns the total of all values in the array. */
    static int calculateArraySum(int[] numbers) {
        int total = 0;
        for (int value : numbers) {
            total += value;
        }
        return total;
    }

    /** Prints every value in the array on one line. */
    static void printArray(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("calculateSum(4, 6) = " + calculateSum(4, 6));
        System.out.println("findMaximum(4, 6)  = " + findMaximum(4, 6));
        System.out.println("isPrime(13)        = " + isPrime(13));

        int[] numbers = {5, 10, 15};
        System.out.print("printArray         = ");
        printArray(numbers);
        System.out.println("calculateArraySum  = " + calculateArraySum(numbers));
    }
}
