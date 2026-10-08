/**
 * Task 2: static Keyword
 * Static variables are shared by all objects, static methods belong to the class,
 * and a static counter tracks how many objects were created.
 */
class Ticket {
    static int ticketsIssued = 0;           // shared counter
    static final String EVENT = "Tech Expo"; // shared constant

    final int ticketNumber;
    String holder;

    Ticket(String holder) {
        ticketsIssued++;
        this.ticketNumber = ticketsIssued;
        this.holder = holder;
    }

    static int getTicketsIssued() {
        return ticketsIssued;
    }

    void print() {
        System.out.println("Ticket #" + ticketNumber + " for " + holder + " (" + EVENT + ")");
    }
}

class MathUtil {
    // Utility methods do not need an object, so they are static
    static int square(int n) {
        return n * n;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

public class StaticKeyword {
    static int programRuns;

    // Static block runs once, when the class is loaded
    static {
        programRuns = 1;
        System.out.println("Static block executed - class loaded.");
    }

    public static void main(String[] args) {
        System.out.println("Tickets before: " + Ticket.getTicketsIssued());

        new Ticket("Anil").print();
        new Ticket("Priya").print();
        new Ticket("Subbu").print();

        System.out.println("Tickets after: " + Ticket.getTicketsIssued());

        System.out.println("\nStatic utility methods:");
        System.out.println("square(7) = " + MathUtil.square(7));
        System.out.println("isEven(10) = " + MathUtil.isEven(10));
        System.out.println("programRuns = " + programRuns);
    }
}
