/**
 * Task 2: Constructors
 * Default and parameterized constructors used to initialise objects.
 */
class Student {
    int id;
    String name;
    String course;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
        course = "Not assigned";
    }

    // Parameterized constructor
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + course);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        Student customStudent = new Student(101, "Subbu", "Core Java");

        System.out.println("Using the default constructor:");
        defaultStudent.display();

        System.out.println("Using the parameterized constructor:");
        customStudent.display();
    }
}
