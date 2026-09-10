/**
 * Weekly Test 1: Core Java Basics
 * A standalone check covering Java setup, variables, data types, operators,
 * and basic console output — written fresh, independent of the other Day 1 tasks.
 *
 * Scenario: a small store inventory check for a single product.
 */
public class WeeklyTest1 {
    public static void main(String[] args) {

        // ---- Java setup check ----
        // Confirms the JVM is installed and reachable, and reports which version is running.
        System.out.println("Java setup check:");
        System.out.println("Java version : " + System.getProperty("java.version"));
        System.out.println();

        // ---- Variables and data types ----
        String productName = "Wireless Mouse";
        int unitsInStock = 42;
        double pricePerUnit = 19.99;
        char stockGrade = 'B';
        boolean isAvailable = unitsInStock > 0;

        // ---- Operators ----
        // Arithmetic operators
        double totalValue = unitsInStock * pricePerUnit;      // multiplication
        int unitsSoldToday = 5;
        int remainingUnits = unitsInStock - unitsSoldToday;    // subtraction
        int reorderBatch = remainingUnits % 10;                // modulus
        int fullBatchesLeft = remainingUnits / 10;              // integer division

        // Increment/decrement operators
        int unitsAfterOneMoreSale = unitsSoldToday;
        unitsAfterOneMoreSale++;                                // increment

        // Relational operators
        boolean isLowStock = remainingUnits < 10;
        boolean isFullyStocked = remainingUnits == unitsInStock;

        // Logical operators
        boolean needsReorder = isLowStock && isAvailable;
        boolean isOutOfStockOrLow = !isAvailable || isLowStock;

        // ---- Console output ----
        System.out.println("Product Inventory Check:");
        System.out.println("Product Name        : " + productName);
        System.out.println("Units In Stock      : " + unitsInStock);
        System.out.println("Price Per Unit      : $" + pricePerUnit);
        System.out.println("Stock Grade         : " + stockGrade);
        System.out.println("Available           : " + isAvailable);
        System.out.println();
        System.out.println("Total Inventory Value        : $" + totalValue);
        System.out.println("Units Sold Today              : " + unitsSoldToday);
        System.out.println("Remaining Units                : " + remainingUnits);
        System.out.println("Units After One More Sale      : " + unitsAfterOneMoreSale);
        System.out.println("Full Batches Of 10 Left        : " + fullBatchesLeft);
        System.out.println("Leftover Units (remainder)     : " + reorderBatch);
        System.out.println();
        System.out.println("Is Low Stock (< 10)            : " + isLowStock);
        System.out.println("Is Fully Stocked (unchanged)   : " + isFullyStocked);
        System.out.println("Needs Reorder                  : " + needsReorder);
        System.out.println("Out Of Stock Or Low             : " + isOutOfStockOrLow);
    }
}
