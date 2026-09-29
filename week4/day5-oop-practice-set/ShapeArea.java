/**
 * OOP Practice 1: Rectangle and Circle classes that calculate their own area
 * and perimeter.
 */
class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 5);
        Circle circle = new Circle(3.5);

        System.out.println("Rectangle area      : " + rectangle.area());
        System.out.println("Rectangle perimeter : " + rectangle.perimeter());
        System.out.printf("Circle area         : %.2f%n", circle.area());
        System.out.printf("Circle perimeter    : %.2f%n", circle.perimeter());
    }
}
