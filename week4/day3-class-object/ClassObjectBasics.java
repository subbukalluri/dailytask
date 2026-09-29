/**
 * Task 1: Class and Object Basics
 * A Student class with fields, displayed through an object.
 */
class Student {
    int id;
    String name;
    String course;
}

public class ClassObjectBasics {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "Subbu";
        student.course = "Core Java";

        System.out.println("Student ID     : " + student.id);
        System.out.println("Student Name   : " + student.name);
        System.out.println("Student Course : " + student.course);

        // A second object has its own copy of the fields.
        Student another = new Student();
        another.id = 102;
        another.name = "Ravi";
        another.course = "Python";

        System.out.println();
        System.out.println("Student ID     : " + another.id);
        System.out.println("Student Name   : " + another.name);
        System.out.println("Student Course : " + another.course);
    }
}
