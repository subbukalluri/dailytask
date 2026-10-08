import java.util.Scanner;

/**
 * Weekly Test 5: Strings, Classes, Constructors, Encapsulation, and Basic OOP Design
 * A small "course enrollment" program that uses a well-encapsulated Student class,
 * constructor overloading, and a few string operations on the student's name.
 */
class Student {
    private static final int MAX_COURSES = 5;

    private final String id;
    private String name;
    private int age;
    private final String[] courses = new String[MAX_COURSES];
    private int courseCount;

    // Constructor with only the required fields
    Student(String id, String name) {
        this(id, name, 18);
    }

    // Full constructor - all validation goes through the setters
    Student(String id, String name, int age) {
        this.id = id;
        setName(name);
        setAge(age);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 100) {
            throw new IllegalArgumentException("Age must be between 16 and 100.");
        }
        this.age = age;
    }

    public boolean enroll(String course) {
        if (courseCount == MAX_COURSES) {
            System.out.println("Cannot enroll in more than " + MAX_COURSES + " courses.");
            return false;
        }
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                System.out.println("Already enrolled in " + courses[i] + ".");
                return false;
            }
        }
        courses[courseCount++] = course;
        return true;
    }

    // String practice: build initials like "S.K." from the full name
    public String getInitials() {
        StringBuilder initials = new StringBuilder();
        for (String part : name.split("\\s+")) {
            initials.append(Character.toUpperCase(part.charAt(0))).append('.');
        }
        return initials.toString();
    }

    public void printProfile() {
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name.toUpperCase());
        System.out.println("Initials : " + getInitials());
        System.out.println("Age      : " + age);
        System.out.print("Courses  : ");
        if (courseCount == 0) {
            System.out.println("none");
        } else {
            System.out.println(String.join(", ", java.util.Arrays.copyOf(courses, courseCount)));
        }
    }
}

public class OopBasicsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine().trim());

        Student student;
        try {
            student = new Student("S101", name, age);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        }

        System.out.print("Enter courses separated by commas: ");
        for (String course : scanner.nextLine().split(",")) {
            if (!course.trim().isEmpty()) {
                student.enroll(course.trim());
            }
        }

        System.out.println();
        student.printProfile();

        // Encapsulation check: invalid updates are rejected by the setter
        try {
            student.setAge(5);
        } catch (IllegalArgumentException e) {
            System.out.println("\nUpdate rejected: " + e.getMessage());
        }
    }
}
