package bank;

/**
 * Task 1: Access Modifiers
 * Account declares one field with each access level so the demo can show
 * which ones are visible from the same package, a subclass, and other packages.
 *
 * How to run (from the day3-access-modifiers folder):
 *   javac -d out bank/*.java app/*.java
 *   java -cp out app.AccessModifiersDemo
 */
public class Account {
    public String bankName = "Denver Savings Bank"; // visible everywhere
    protected String accountType = "Savings";        // same package + subclasses
    String branchCode = "DEN-01";                    // default: same package only
    private double balance = 5000.0;                  // this class only

    // Private data is exposed safely through a public method
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
