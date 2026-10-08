/**
 * Task 2: Abstract Class
 * Shape defines the common structure; each child implements its own area().
 */
abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    // Abstract method - no body, every child must implement it
    abstract double area();

    // Concrete method shared by all shapes
    void printArea() {
        System.out.printf("%-10s area = %.2f%n", name, area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Shape shape = new Shape("x"); // not allowed: Shape is abstract
        Shape[] shapes = { new Circle(3), new Square(4), new Triangle(6, 5) };
        for (Shape shape : shapes) {
            shape.printArea();
        }
    }
}
