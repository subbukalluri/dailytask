/**
 * Task 3: Methods Inside Class
 * Class methods for displaying and updating object data.
 */
class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }

    void updateName(String newName) {
        name = newName;
    }

    void updateMarks(int newMarks) {
        marks = newMarks;
    }
}

public class MethodsInClass {
    public static void main(String[] args) {
        Student student = new Student(101, "Subbu", 70);

        System.out.println("Before update:");
        student.display();

        student.updateName("Subbu K");
        student.updateMarks(85);

        System.out.println("After update:");
        student.display();
    }
}
