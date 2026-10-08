/**
 * Task 1: Command Line Arguments
 * Reads name, age, and city from the command line and prints a formatted message.
 *
 * Example: java CommandLineArgs Subbu 30 Denver
 */
public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        if (args.length < 3) {
            System.out.println("Usage: java CommandLineArgs <name> <age> <city>");
            return;
        }

        String name = args[0];
        String city = args[2];
        int age;
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a number, but got: " + args[1]);
            return;
        }

        System.out.println("--------------------------------");
        System.out.printf("Hello, %s!%n", name);
        System.out.printf("You are %d years old and live in %s.%n", age, city);
        System.out.printf("In 5 years you will be %d.%n", age + 5);
        System.out.println("--------------------------------");

        if (args.length > 3) {
            System.out.print("Extra arguments:");
            for (int i = 3; i < args.length; i++) {
                System.out.print(" " + args[i]);
            }
            System.out.println();
        }
    }
}
