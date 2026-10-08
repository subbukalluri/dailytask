/**
 * Task 3: final Keyword
 * final variables cannot be reassigned, final methods cannot be overridden,
 * and final classes cannot be extended.
 */
class Config {
    static final double TAX_RATE = 0.08; // constant
    final String appName;                // set once, in the constructor

    Config(String appName) {
        this.appName = appName;
    }

    // Child classes can use this method but cannot change it
    final double addTax(double amount) {
        return amount + amount * TAX_RATE;
    }

    void greet() {
        System.out.println("Welcome to " + appName);
    }
}

class StoreConfig extends Config {
    StoreConfig() {
        super("Store App");
    }

    @Override
    void greet() { // allowed: greet() is not final
        System.out.println("Welcome to the " + appName + " checkout");
    }

    // double addTax(double amount) { ... } // ERROR: cannot override a final method
}

final class Currency {
    // No class can extend Currency
    static String format(double amount) {
        return String.format("$%.2f", amount);
    }
}

// class Rupee extends Currency { } // ERROR: cannot inherit from a final class

public class FinalKeyword {
    public static void main(String[] args) {
        final int maxItems = 3;
        // maxItems = 5; // ERROR: cannot assign a value to a final variable

        StoreConfig config = new StoreConfig();
        config.greet();
        // config.appName = "Other"; // ERROR: appName is final

        double price = 49.99;
        System.out.println("Max items per order: " + maxItems);
        System.out.println("Price with tax: " + Currency.format(config.addTax(price)));

        // A final reference cannot point to another object, but the object can still change
        final StringBuilder note = new StringBuilder("Order");
        note.append(" confirmed");
        System.out.println(note);
    }
}
