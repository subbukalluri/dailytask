/**
 * Task 3 (Version 2): Swap Two Numbers WITHOUT using a temporary variable.
 * Uses arithmetic (addition/subtraction) to swap the values in place.
 */
public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 15;
        int b = 42;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; // a now holds the sum of both numbers
        b = a - b; // subtracting original b from the sum gives the original a
        a = a - b; // subtracting the new b (original a) from the sum gives the original b

        System.out.println("After swap:  a = " + a + ", b = " + b);
    }
}
