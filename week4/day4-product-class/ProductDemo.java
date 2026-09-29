import java.util.Scanner;

/**
 * Task 2: Product Class
 * Calculates the bill amount from price and quantity.
 */
class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateBill() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product  : " + name);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Bill     : " + calculateBill());
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine().trim());

        Product product = new Product(name, price, quantity);
        System.out.println();
        product.display();
    }
}
