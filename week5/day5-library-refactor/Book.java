/**
 * Task 2: Project Refactoring
 * A single book in the library. Tracks whether it is issued and to whom.
 */
public class Book {
    private final int bookId;
    private final String title;
    private final String author;
    private String issuedTo; // null when the book is available

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return issuedTo == null;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void issueTo(String memberName) {
        this.issuedTo = memberName;
    }

    public void markReturned() {
        this.issuedTo = null;
    }

    public boolean matches(String keyword) {
        String lower = keyword.toLowerCase();
        return title.toLowerCase().contains(lower) || author.toLowerCase().contains(lower);
    }

    @Override
    public String toString() {
        String status = isAvailable() ? "Available" : "Issued to " + issuedTo;
        return String.format("%-4d %-28s %-22s %s", bookId, title, author, status);
    }
}
