/**
 * Task 1: this Keyword
 * Uses this() for constructor chaining, this.field to resolve name clashes,
 * and returns this to allow method chaining.
 */
class Rectangle {
    private double length;
    private double width;
    private String color;

    Rectangle() {
        this(1, 1); // chain to the two-argument constructor
    }

    Rectangle(double length, double width) {
        this(length, width, "white"); // chain to the full constructor
    }

    Rectangle(double length, double width, String color) {
        this.length = length; // this.length is the field, length is the parameter
        this.width = width;
        this.color = color;
    }

    Rectangle setColor(String color) {
        this.color = color;
        return this; // return the current object so calls can be chained
    }

    Rectangle scale(double factor) {
        this.length *= factor;
        this.width *= factor;
        return this;
    }

    void display() {
        System.out.println(color + " rectangle " + length + " x " + width + ", area = " + (length * width));
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        new Rectangle().display();
        new Rectangle(4, 3).display();
        new Rectangle(5, 2, "blue").display();

        System.out.println("\nMethod chaining with 'return this':");
        new Rectangle(2, 3).setColor("green").scale(2).display();
    }
}
