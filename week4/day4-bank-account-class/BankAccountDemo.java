import java.util.Scanner;

/**
 * Task 3: Bank Account Class
 * Deposit, withdraw, and balance methods.
 */
class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double openingBalance) {
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println(accountHolder + "'s balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("Subbu", 1000.0);

        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(Double.parseDouble(scanner.nextLine().trim()));
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(Double.parseDouble(scanner.nextLine().trim()));
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
