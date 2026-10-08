/**
 * Task 4: Documentation Notes - Inheritance
 *
 * NOTE: Inheritance lets a child class reuse the fields and methods of a parent
 * class using the "extends" keyword. It models an "is-a" relationship:
 * a SavingsAccount IS AN Account. Java allows only one parent class.
 */
class Account {
    protected double balance; // NOTE: protected so child classes can use it

    void deposit(double amount) {
        balance += amount;
    }
}

// NOTE: SavingsAccount gets deposit() and balance from Account without rewriting them
class SavingsAccount extends Account {
    double interestRate = 0.04;

    // NOTE: new behavior that only the child class has
    void addInterest() {
        balance += balance * interestRate;
    }
}

public class InheritanceNotes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.deposit(1000);  // NOTE: inherited method
        savings.addInterest();  // NOTE: child's own method
        System.out.println("Balance after interest: " + savings.balance);
    }
}
