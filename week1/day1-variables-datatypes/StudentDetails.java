/**
 * Task 2: Variables and Data Types
 * Stores student details using int, double, char, boolean, and String variables,
 * then prints them in a readable format.
 */
public class StudentDetails {
    public static void main(String[] args) {
        int rollNumber = 101;
        double gpa = 8.75;
        char grade = 'A';
        boolean isEnrolled = true;
        String name = "Ananya Rao";

        System.out.println("---------- Student Details ----------");
        System.out.println("Name         : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("GPA          : " + gpa);
        System.out.println("Grade        : " + grade);
        System.out.println("Enrolled     : " + isEnrolled);
        System.out.println("--------------------------------------");
    }
}
