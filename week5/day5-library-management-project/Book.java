/**
 * Task 1: Mini Project - Library Management App
 * Book holds the details of one book and whether it is issued.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;
    private String issuedTo;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isIssued() { return issued; }
    public String getIssuedTo() { return issuedTo; }

    public void issue(String member) {
        issued = true;
        issuedTo = member;
    }

    public void show() {
        String status = issued ? "Issued to " + issuedTo : "Available";
        System.out.println(id + " | " + title + " | " + author + " | " + status);
    }
}
