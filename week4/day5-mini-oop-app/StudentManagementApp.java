import java.util.Scanner;

/**
 * Task 1: Mini OOP Application
 * Simple student management console app using classes and objects.
 */
class Student {
    private int id;
    private String name;
    private int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + marks);
    }
}

public class StudentManagementApp {

    static Student[] students = new Student[50];
    static int count = 0;

    static void addStudent(Scanner scanner) {
        if (count == students.length) {
            System.out.println("Student list is full.");
            return;
        }
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter marks: ");
        int marks = Integer.parseInt(scanner.nextLine().trim());

        students[count++] = new Student(id, name, marks);
        System.out.println("Student added.");
    }

    static void viewStudents() {
        if (count == 0) {
            System.out.println("No students yet.");
            return;
        }
        System.out.println("ID | Name | Marks");
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    static Student findStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    static void searchStudent(Scanner scanner) {
        System.out.print("Enter ID to search: ");
        Student student = findStudent(Integer.parseInt(scanner.nextLine().trim()));
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            student.display();
        }
    }

    static void updateMarks(Scanner scanner) {
        System.out.print("Enter ID to update: ");
        Student student = findStudent(Integer.parseInt(scanner.nextLine().trim()));
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        System.out.print("Enter new marks: ");
        student.setMarks(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Marks updated.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add student");
            System.out.println("2. View all students");
            System.out.println("3. Search student");
            System.out.println("4. Update marks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    updateMarks(scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
