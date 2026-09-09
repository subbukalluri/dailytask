/**
 * Task 2: Type Casting
 * Demonstrates implicit (widening) and explicit (narrowing) type casting
 * in Java, with comments explaining each conversion.
 */
public class TypeCasting {
    public static void main(String[] args) {

        // ---------- IMPLICIT CASTING (widening conversion) ----------
        // Java automatically converts a smaller data type into a larger one.
        // No data is lost because the target type can hold a wider range of values.

        int intValue = 25;
        // int -> double: automatic/implicit conversion, no explicit syntax needed.
        double implicitDouble = intValue;
        System.out.println("Implicit casting (int -> double):");
        System.out.println("int value    : " + intValue);
        System.out.println("double value : " + implicitDouble);
        System.out.println();

        long longValue = 10000L;
        // long -> float: implicit widening conversion.
        float implicitFloat = longValue;
        System.out.println("Implicit casting (long -> float):");
        System.out.println("long value  : " + longValue);
        System.out.println("float value : " + implicitFloat);
        System.out.println();

        // ---------- EXPLICIT CASTING (narrowing conversion) ----------
        // Converting a larger data type into a smaller one requires an
        // explicit cast, written as (targetType) value, because data
        // (such as the fractional part) can be lost in the process.

        double doubleValue = 99.75;
        // double -> int: explicit cast required; the fractional part (.75) is discarded.
        int explicitInt = (int) doubleValue;
        System.out.println("Explicit casting (double -> int):");
        System.out.println("double value : " + doubleValue);
        System.out.println("int value    : " + explicitInt + " (decimal part truncated, not rounded)");
        System.out.println();

        float floatValue = 7.89f;
        // float -> long: explicit cast required; fractional part is discarded.
        long explicitLong = (long) floatValue;
        System.out.println("Explicit casting (float -> long):");
        System.out.println("float value : " + floatValue);
        System.out.println("long value  : " + explicitLong);
        System.out.println();

        int largeInt = 130;
        // int -> byte: explicit cast; byte range is -128 to 127, so this
        // value overflows/wraps around and demonstrates possible data loss.
        byte explicitByte = (byte) largeInt;
        System.out.println("Explicit casting (int -> byte), showing possible overflow:");
        System.out.println("int value  : " + largeInt);
        System.out.println("byte value : " + explicitByte + " (overflowed because byte max is 127)");
    }
}
