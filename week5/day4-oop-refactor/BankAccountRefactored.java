import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Task 3: Object-Oriented Refactoring
 * Refactored version of week4/day4-bank-account-class/BankAccountDemo.java.
 *
 * What changed:
 *  - Fields are now private (encapsulation) and the balance is only changed through methods.
 *  - deposit() and withdraw() return true/false instead of printing, so the class
 *    no longer mixes business logic with console output.
 *  - Added a transaction history and an account number generated with a static counter.
 *  - The menu was split into small methods, and invalid (non-numeric) input no longer crashes the app.
 */
class BankAccount {
    private static int nextAccountNumber = 1001;

    private final int accountNumber;
    private final String accountHolder;
    private double balance;
    private final List<String> history = new ArrayList<>();

    BankAccount(String accountHolder, double openingBalance) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolder = accountHolder;
        this.balance = Math.max(0, openingBalance);
        history.add("Opened with " + format(this.balance));
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        history.add("Deposit    +" + format(amount));
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        history.add("Withdrawal -" + format(amount));
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public List<String> getHistory() {
        return new ArrayList<>(history); // return a copy so callers cannot modify it
    }

    static String format(double amount) {
        return String.format("%.2f", amount);
    }
}

public class BankAccountRefactored {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Subbu", 1000.0);
        System.out.println("Account #" + account.getAccountNumber() + " opened for " + account.getAccountHolder());

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");
            switch (choice) {
                case 1:
                    handleDeposit(account);
                    break;
                case 2:
                    handleWithdraw(account);
                    break;
                case 3:
                    System.out.println("Balance: " + BankAccount.format(account.getBalance()));
                    break;
                case 4:
                    printHistory(account);
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("===== BANK MENU =====");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Transaction history");
        System.out.println("5. Exit");
    }

    private static void handleDeposit(BankAccount account) {
        double amount = readDouble("Enter amount to deposit: ");
        if (account.deposit(amount)) {
            System.out.println("Deposited. New balance: " + BankAccount.format(account.getBalance()));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    private static void handleWithdraw(BankAccount account) {
        double amount = readDouble("Enter amount to withdraw: ");
        if (account.withdraw(amount)) {
            System.out.println("Withdrawn. New balance: " + BankAccount.format(account.getBalance()));
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    private static void printHistory(BankAccount account) {
        System.out.println("Transaction history:");
        for (String entry : account.getHistory()) {
            System.out.println("  " + entry);
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(SCANNER.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(SCANNER.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid amount.");
            }
        }
    }
}
