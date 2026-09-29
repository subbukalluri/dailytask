/**
 * Task 3: Method Overloading
 * Same method name, different parameter counts and types.
 */
public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    // Different number of parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Different parameter type
    static double add(double a, double b) {
        return a + b;
    }

    // Different parameter type (joins text)
    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("add(2, 3)              = " + add(2, 3));
        System.out.println("add(2, 3, 4)           = " + add(2, 3, 4));
        System.out.println("add(2.5, 3.5)          = " + add(2.5, 3.5));
        System.out.println("add(\"Hello \", \"Java\") = " + add("Hello ", "Java"));
    }
}
