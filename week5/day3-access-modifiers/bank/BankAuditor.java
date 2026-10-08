package bank;

/**
 * Same package as Account, so it can read public, protected, and default members,
 * but not private ones.
 */
public class BankAuditor {
    public void audit(Account account) {
        System.out.println("[Same package] bankName    = " + account.bankName);
        System.out.println("[Same package] accountType = " + account.accountType);
        System.out.println("[Same package] branchCode  = " + account.branchCode);
        // System.out.println(account.balance); // ERROR: balance is private
        System.out.println("[Same package] balance via getter = " + account.getBalance());
    }
}
