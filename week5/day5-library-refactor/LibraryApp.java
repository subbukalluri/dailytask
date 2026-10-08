import java.util.List;
import java.util.Scanner;

/**
 * Task 2: Project Refactoring
 * Menu-driven console app. Compared with day5-library-management-project:
 *  - Clear names (library, scanner, choice) instead of lib, sc, ch.
 *  - Each menu option has its own method, and the menu uses a switch.
 *  - Invalid numbers and empty input are handled instead of crashing.
 *  - Added "Return a book" and search by title OR author.
 *
 * Run: javac *.java && java LibraryApp
 */
public class LibraryApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {
        loadSampleBooks();
        System.out.println("Welcome to the Library Management App");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readNumber("Enter your choice: ");
            switch (choice) {
                case 1: addBook(); break;
                case 2: searchBooks(); break;
                case 3: issueBook(); break;
                case 4: returnBook(); break;
                case 5: listBooks(); break;
                case 6:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please choose an option from 1 to 6.");
            }
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("========== LIBRARY MENU ==========");
        System.out.println("1. Add a book");
        System.out.println("2. Search books");
        System.out.println("3. Issue a book");
        System.out.println("4. Return a book");
        System.out.println("5. List all books");
        System.out.println("6. Exit");
    }

    private static void loadSampleBooks() {
        library.addBook("Clean Code", "Robert C. Martin");
        library.addBook("Effective Java", "Joshua Bloch");
        library.addBook("Head First Java", "Kathy Sierra");
    }

    private static void addBook() {
        String title = readText("Title: ");
        String author = readText("Author: ");
        Book book = library.addBook(title, author);
        System.out.println("Added \"" + book.getTitle() + "\" with ID " + book.getBookId() + ".");
    }

    private static void searchBooks() {
        String keyword = readText("Enter title or author to search: ");
        List<Book> results = library.searchBooks(keyword);
        if (results.isEmpty()) {
            System.out.println("No books matched \"" + keyword + "\".");
        } else {
            printBooks(results);
        }
    }

    private static void issueBook() {
        int bookId = readNumber("Book ID: ");
        String memberName = readText("Member name: ");
        switch (library.issueBook(bookId, memberName)) {
            case ISSUED:
                System.out.println("Book " + bookId + " issued to " + memberName + ".");
                break;
            case ALREADY_ISSUED:
                System.out.println("Book " + bookId + " is already issued.");
                break;
            default:
                System.out.println("No book found with ID " + bookId + ".");
        }
    }

    private static void returnBook() {
        int bookId = readNumber("Book ID to return: ");
        if (library.returnBook(bookId)) {
            System.out.println("Book " + bookId + " returned. Thank you!");
        } else {
            System.out.println("Book " + bookId + " was not found or is not issued.");
        }
    }

    private static void listBooks() {
        List<Book> books = library.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("The library has no books yet.");
        } else {
            printBooks(books);
        }
    }

    private static void printBooks(List<Book> books) {
        System.out.println(String.format("%-4s %-28s %-22s %s", "ID", "Title", "Author", "Status"));
        System.out.println("-".repeat(70));
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static int readNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static String readText(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("This field cannot be empty.");
        }
    }
}
