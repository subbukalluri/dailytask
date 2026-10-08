package app;

import bank.Account;

/**
 * Different package, but a subclass of Account, so it can use protected members
 * (through inheritance) as well as public ones.
 */
public class PremiumAccount extends Account {
    public void describe() {
        System.out.println("[Subclass]     bankName    = " + bankName);
        System.out.println("[Subclass]     accountType = " + accountType); // protected: allowed
        // System.out.println(branchCode); // ERROR: default access, different package
    }
}
