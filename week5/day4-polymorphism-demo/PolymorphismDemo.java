/**
 * Task 2: Polymorphism Demo
 * Compile-time polymorphism: overloaded calculateFare() methods.
 * Runtime polymorphism: each ride type overrides calculateFare(double).
 */
class Ride {
    String rideName = "Standard Ride";
    double ratePerKm = 15;

    // Overloaded versions (compile-time polymorphism)
    double calculateFare(double km) {
        return km * ratePerKm;
    }

    double calculateFare(double km, double waitingMinutes) {
        return calculateFare(km) + waitingMinutes * 2;
    }

    double calculateFare(double km, double waitingMinutes, String promoCode) {
        double fare = calculateFare(km, waitingMinutes);
        return promoCode.equalsIgnoreCase("SAVE10") ? fare * 0.9 : fare;
    }
}

class BikeRide extends Ride {
    BikeRide() {
        rideName = "Bike Ride";
        ratePerKm = 8;
    }
}

class PremiumRide extends Ride {
    PremiumRide() {
        rideName = "Premium Ride";
        ratePerKm = 25;
    }

    // Overridden (runtime polymorphism): premium rides add a base charge
    @Override
    double calculateFare(double km) {
        return 50 + km * ratePerKm;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("Compile-time polymorphism (overloading):");
        Ride ride = new Ride();
        System.out.println("  10 km                     = " + ride.calculateFare(10));
        System.out.println("  10 km + 5 min wait        = " + ride.calculateFare(10, 5));
        System.out.println("  10 km + 5 min + SAVE10    = " + ride.calculateFare(10, 5, "SAVE10"));

        System.out.println("\nRuntime polymorphism (overriding):");
        Ride[] rides = { new Ride(), new BikeRide(), new PremiumRide() };
        for (Ride r : rides) {
            // The method that runs depends on the actual object, not the reference type
            System.out.printf("  %-14s 12 km = %.2f%n", r.rideName, r.calculateFare(12));
        }
    }
}
