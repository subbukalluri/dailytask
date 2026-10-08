import java.util.Scanner;

/**
 * Task 1: Mini Project - Library Management App
 * Console menu for adding, searching, issuing, and listing books.
 *
 * Run: javac *.java && java LibraryApp
 */
public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook("Clean Code", "Robert C. Martin");
        lib.addBook("Effective Java", "Joshua Bloch");
        lib.addBook("Head First Java", "Kathy Sierra");

        while (true) {
            System.out.println("\n1.Add 2.Search 3.Issue 4.Show all 5.Exit");
            System.out.print("Enter choice: ");
            int ch = Integer.parseInt(sc.nextLine());

            if (ch == 1) {
                System.out.print("Title: ");
                String t = sc.nextLine();
                System.out.print("Author: ");
                String a = sc.nextLine();
                lib.addBook(t, a);
            } else if (ch == 2) {
                System.out.print("Enter title to search: ");
                lib.search(sc.nextLine());
            } else if (ch == 3) {
                System.out.print("Book id: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Member name: ");
                lib.issueBook(id, sc.nextLine());
            } else if (ch == 4) {
                lib.showAll();
            } else if (ch == 5) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Wrong choice");
            }
        }
    }
}
