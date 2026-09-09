import java.util.Scanner;

/**
 * Task 4: Area Formulas
 * Calculates the area of a circle, rectangle, and triangle based on user input.
 */
public class AreaFormulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ---------- Circle ----------
        System.out.print("Enter the radius of the circle: ");
        double radius = Double.parseDouble(scanner.nextLine().trim());
        double circleArea = Math.PI * radius * radius;

        // ---------- Rectangle ----------
        System.out.print("Enter the length of the rectangle: ");
        double length = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Enter the width of the rectangle: ");
        double width = Double.parseDouble(scanner.nextLine().trim());
        double rectangleArea = length * width;

        // ---------- Triangle ----------
        System.out.print("Enter the base of the triangle: ");
        double base = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Enter the height of the triangle: ");
        double height = Double.parseDouble(scanner.nextLine().trim());
        double triangleArea = 0.5 * base * height;

        System.out.println();
        System.out.println("---------- Areas ----------");
        System.out.printf("Circle area (r=%.2f)        : %.2f%n", radius, circleArea);
        System.out.printf("Rectangle area (%.2f x %.2f) : %.2f%n", length, width, rectangleArea);
        System.out.printf("Triangle area (b=%.2f,h=%.2f): %.2f%n", base, height, triangleArea);

        scanner.close();
    }
}
