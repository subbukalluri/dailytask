import java.util.Scanner;

/**
 * Task 4: Student Result Application
 * Stores marks and calculates total, average, and grade.
 */
class StudentResult {
    String name;
    int[] marks;

    StudentResult(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    char calculateGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 40) {
            return 'D';
        }
        return 'F';
    }

    void displayResult() {
        System.out.println("----- Result -----");
        System.out.println("Student : " + name);
        System.out.println("Total   : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
        System.out.println("Grade   : " + calculateGrade());
    }
}

public class StudentResultApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("How many subjects? ");
        int subjects = Integer.parseInt(scanner.nextLine().trim());

        int[] marks = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        StudentResult result = new StudentResult(name, marks);
        result.displayResult();
    }
}
