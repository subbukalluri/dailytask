/**
 * OOP Practice 2: Book class with issue and return behaviour.
 */
class Book {
    String title;
    String author;
    boolean available;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("\"" + title + "\" has been issued.");
        } else {
            System.out.println("\"" + title + "\" is already issued.");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            System.out.println("\"" + title + "\" has been returned.");
        } else {
            System.out.println("\"" + title + "\" was not issued.");
        }
    }

    void display() {
        System.out.println(title + " by " + author + " - " + (available ? "Available" : "Issued"));
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book book = new Book("Head First Java", "Kathy Sierra");

        book.display();
        book.issueBook();
        book.issueBook();
        book.display();
        book.returnBook();
        book.display();
    }
}
