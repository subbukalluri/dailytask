/**
 * Task 1: Inheritance Basics
 * A Car inherits the fields and methods of Vehicle and adds its own.
 */
class Vehicle {
    String brand;
    int year;

    void start() {
        System.out.println(brand + " is starting.");
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    void openTrunk() {
        System.out.println(brand + " trunk is open.");
    }
}

public class InheritanceBasics {
    public static void main(String[] args) {
        Car car = new Car();

        // Fields inherited from Vehicle
        car.brand = "Toyota";
        car.year = 2022;
        // Field defined in Car
        car.numberOfDoors = 4;

        car.showDetails(); // inherited method
        car.start();       // inherited method
        car.openTrunk();   // Car's own method
        System.out.println("Doors: " + car.numberOfDoors);

        System.out.println("Is a Car also a Vehicle? " + (car instanceof Vehicle));
    }
}
