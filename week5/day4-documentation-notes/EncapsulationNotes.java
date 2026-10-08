/**
 * Task 4: Documentation Notes - Encapsulation
 *
 * NOTE: Encapsulation means keeping an object's data private and allowing access
 * only through methods. This protects the data from invalid values and lets the
 * class change its internal details without breaking the code that uses it.
 */
class Thermostat {
    // NOTE: private - no other class can set the temperature directly
    private double temperature = 22.0;

    // NOTE: getter - read-only access to the private field
    public double getTemperature() {
        return temperature;
    }

    // NOTE: setter with validation - the class decides which values are allowed
    public void setTemperature(double temperature) {
        if (temperature < 10 || temperature > 30) {
            System.out.println("Rejected " + temperature + " - must be between 10 and 30.");
            return;
        }
        this.temperature = temperature;
    }
}

public class EncapsulationNotes {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.setTemperature(25);
        thermostat.setTemperature(45); // rejected by the setter
        // thermostat.temperature = 45; // NOTE: compile error, the field is private
        System.out.println("Current temperature: " + thermostat.getTemperature());
    }
}
