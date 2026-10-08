import java.util.ArrayList;
import java.util.List;

/**
 * Task 4: Final Project Push - Library Management App
 * Holds the book collection and the library rules. It returns results instead of
 * printing them, so the console code in LibraryApp decides how to show messages.
 */
public class Library {
    public enum IssueResult { ISSUED, ALREADY_ISSUED, NOT_FOUND }

    private final List<Book> books = new ArrayList<>();
    private int nextBookId = 1;

    public Book addBook(String title, String author) {
        Book book = new Book(nextBookId++, title, author);
        books.add(book);
        return book;
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.matches(keyword)) {
                results.add(book);
            }
        }
        return results;
    }

    public IssueResult issueBook(int bookId, String memberName) {
        Book book = findById(bookId);
        if (book == null) {
            return IssueResult.NOT_FOUND;
        }
        if (!book.isAvailable()) {
            return IssueResult.ALREADY_ISSUED;
        }
        book.issueTo(memberName);
        return IssueResult.ISSUED;
    }

    public boolean returnBook(int bookId) {
        Book book = findById(bookId);
        if (book == null || book.isAvailable()) {
            return false;
        }
        book.markReturned();
        return true;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    private Book findById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
