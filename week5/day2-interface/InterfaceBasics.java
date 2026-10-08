/**
 * Task 3: Interface Basics
 * A Payment interface with two different implementations.
 */
interface Payment {
    void pay(double amount);

    // Default method: shared behavior that implementing classes get for free
    default void printReceipt(double amount) {
        System.out.println("Receipt: paid " + amount + " successfully.");
    }
}

class CreditCardPayment implements Payment {
    private final String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        String lastFour = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Paid " + amount + " with credit card ending in " + lastFour);
    }
}

class UpiPayment implements Payment {
    private final String upiId;

    UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI ID " + upiId);
    }
}

public class InterfaceBasics {
    public static void main(String[] args) {
        Payment card = new CreditCardPayment("4111222233334444");
        Payment upi = new UpiPayment("subbu@bank");

        card.pay(1500);
        card.printReceipt(1500);

        upi.pay(250);
        upi.printReceipt(250);
    }
}
