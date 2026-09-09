/**
 * Task 3 (Version 1): Swap Two Numbers USING a temporary variable.
 */
public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 15;
        int b = 42;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a; // store the value of 'a' temporarily
        a = b;        // assign 'b' into 'a'
        b = temp;     // assign the stored original 'a' into 'b'

        System.out.println("After swap:  a = " + a + ", b = " + b);
    }
}
