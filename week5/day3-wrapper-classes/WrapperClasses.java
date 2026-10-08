import java.util.ArrayList;
import java.util.List;

/**
 * Task 4: Wrapper Classes
 * Converts primitives to wrapper objects and back, both manually and with autoboxing.
 */
public class WrapperClasses {
    public static void main(String[] args) {
        // 1. Primitive -> wrapper (boxing)
        int num = 25;
        Integer boxedManually = Integer.valueOf(num);
        Integer autoBoxed = num;
        System.out.println("Boxed: " + boxedManually + ", auto-boxed: " + autoBoxed);

        // 2. Wrapper -> primitive (unboxing)
        Double priceObject = 99.5;
        double priceManual = priceObject.doubleValue();
        double priceAuto = priceObject;
        System.out.println("Unboxed: " + priceManual + ", auto-unboxed: " + priceAuto);

        // 3. String <-> wrapper / primitive
        int parsed = Integer.parseInt("120");
        Boolean flag = Boolean.valueOf("true");
        String text = Integer.toString(parsed);
        System.out.println("Parsed int: " + parsed + ", Boolean: " + flag + ", back to String: \"" + text + "\"");

        // 4. Useful wrapper constants and methods
        System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Is '7' a digit? " + Character.isDigit('7'));
        System.out.println("Binary of 10: " + Integer.toBinaryString(10));

        // 5. Collections can only hold objects, so autoboxing happens here
        List<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(92);
        marks.add(78);
        int total = 0;
        for (int mark : marks) { // auto-unboxing in the loop
            total += mark;
        }
        System.out.println("Marks " + marks + ", total = " + total);

        // 6. Comparing wrappers: use equals(), not ==
        Integer a = 1000;
        Integer b = 1000;
        System.out.println("a == b: " + (a == b) + ", a.equals(b): " + a.equals(b));
    }
}
