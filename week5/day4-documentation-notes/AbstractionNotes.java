/**
 * Task 4: Documentation Notes - Abstraction
 *
 * NOTE: Abstraction hides HOW something works and shows only WHAT it does.
 * In Java this is done with abstract classes (partial implementation allowed)
 * and interfaces (a contract that classes promise to follow).
 */
interface Printable {
    // NOTE: interface methods are public and abstract by default
    void print();
}

abstract class Document implements Printable {
    protected String title;

    Document(String title) {
        this.title = title;
    }

    // NOTE: abstract method - every document type must say how many pages it has
    abstract int pageCount();

    // NOTE: concrete method shared by all documents
    public void print() {
        System.out.println("Printing \"" + title + "\" (" + pageCount() + " pages)");
    }
}

class Invoice extends Document {
    Invoice(String title) {
        super(title);
    }

    @Override
    int pageCount() {
        return 1;
    }
}

class Report extends Document {
    private final int sections;

    Report(String title, int sections) {
        super(title);
        this.sections = sections;
    }

    @Override
    int pageCount() {
        return sections * 3; // NOTE: the caller never needs to know this rule
    }
}

public class AbstractionNotes {
    public static void main(String[] args) {
        // NOTE: we work with the abstraction (Printable), not the concrete classes
        Printable[] documents = { new Invoice("October Invoice"), new Report("Q3 Report", 4) };
        for (Printable document : documents) {
            document.print();
        }
    }
}
