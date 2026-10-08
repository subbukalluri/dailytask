import java.util.ArrayList;

/**
 * Task 1: Mini Project - Library Management App
 * Library stores the books and performs add, search, and issue operations.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void addBook(String title, String author) {
        Book b = new Book(nextId, title, author);
        books.add(b);
        nextId++;
        System.out.println("Book added with id " + b.getId());
    }

    public void search(String text) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(text.toLowerCase())) {
                b.show();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found.");
        }
    }

    public void issueBook(int id, String member) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isIssued()) {
                    System.out.println("Book is already issued.");
                } else {
                    b.issue(member);
                    System.out.println("Book issued to " + member);
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void showAll() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        }
        for (Book b : books) {
            b.show();
        }
    }
}
