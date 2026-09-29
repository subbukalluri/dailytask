/**
 * Task 1: Employee Class
 * Employee with id, name, and salary plus a display method.
 */
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee first = new Employee(1, "Subbu", 55000.0);
        Employee second = new Employee(2, "Ravi", 48000.5);

        first.display();
        System.out.println();
        second.display();
    }
}
