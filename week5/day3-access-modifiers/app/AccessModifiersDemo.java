package app;

import bank.Account;
import bank.BankAuditor;

/**
 * Different package and not a subclass, so only public members are visible.
 */
public class AccessModifiersDemo {
    public static void main(String[] args) {
        Account account = new Account();

        new BankAuditor().audit(account);
        System.out.println();

        new PremiumAccount().describe();
        System.out.println();

        System.out.println("[Other package] bankName = " + account.bankName);
        // System.out.println(account.accountType); // ERROR: protected
        // System.out.println(account.branchCode);  // ERROR: default
        // System.out.println(account.balance);     // ERROR: private
        account.deposit(1500);
        System.out.println("[Other package] balance after deposit = " + account.getBalance());
    }
}
