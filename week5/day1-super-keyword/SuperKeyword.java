/**
 * Task 3: Use of super Keyword
 * Calls the parent constructor, a parent method, and a hidden parent field using super.
 */
class Employee {
    String name;
    double salary;
    String type = "Employee";

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee constructor called for " + name);
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;
    String type = "Manager";

    Manager(String name, double salary, double bonus) {
        super(name, salary); // must be the first statement
        this.bonus = bonus;
        System.out.println("Manager constructor called for " + name);
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // reuse the parent's version first
        System.out.println("Bonus: " + bonus + ", Total pay: " + (salary + bonus));
    }

    void showTypes() {
        System.out.println("this.type  = " + this.type);
        System.out.println("super.type = " + super.type);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Manager manager = new Manager("Ravi", 80000, 15000);
        System.out.println();
        manager.displayInfo();
        System.out.println();
        manager.showTypes();
    }
}
