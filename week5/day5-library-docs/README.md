# Library Management App

A console-based Java application for managing a small library. Users can add books, search by title or author, issue a book to a member, return it, and list every book with its status.

The refactored code is in `../day5-library-refactor`, and the final version is in `../day5-library-final-push`.

## How to run

```bash
javac *.java
java LibraryApp
```

## Classes

### `Book`
Represents one book.

| Member | Description |
|--------|-------------|
| `bookId`, `title`, `author` | Final fields set once in the constructor |
| `issuedTo` | Name of the member who has the book, or `null` when it is available |
| `isAvailable()` | `true` when the book is not issued |
| `issueTo(memberName)` | Marks the book as issued to a member |
| `markReturned()` | Makes the book available again |
| `matches(keyword)` | Case-insensitive match against the title or author |
| `toString()` | One formatted row: ID, title, author, and status |

### `Library`
Stores the books and applies the library rules. It does not print anything. It returns results so the app can decide what to show.

| Method | Description |
|--------|-------------|
| `addBook(title, author)` | Creates a book with the next ID and returns it |
| `searchBooks(keyword)` | Returns every book whose title or author matches |
| `issueBook(bookId, memberName)` | Returns `ISSUED`, `ALREADY_ISSUED`, or `NOT_FOUND` |
| `returnBook(bookId)` | Returns `true` if an issued book was returned |
| `getAllBooks()` | Returns a copy of the book list |
| `findById(bookId)` | Private helper used by issue and return |

### `LibraryApp`
The console user interface. It owns the `Scanner` and the `Library`, shows the menu, and has one method per menu option (`addBook`, `searchBooks`, `issueBook`, `returnBook`, `listBooks`). The helpers `readNumber` and `readText` keep asking until the input is valid.

## Application flow

1. `main` loads three sample books and shows the menu.
2. The user picks an option from 1 to 6.
3. `LibraryApp` reads the input, calls the matching `Library` method, and prints the result.
4. The menu repeats until the user chooses **6. Exit**.

```
LibraryApp (menu and input)  ->  Library (rules and storage)  ->  Book (data)
```

## OOP concepts used

- **Encapsulation**: all fields are private and changed only through methods.
- **Separation of concerns**: `Library` holds the logic, while `LibraryApp` handles input and output.
- **Enum**: `Library.IssueResult` describes the outcome of issuing a book.
- **Overriding**: `Book` overrides `toString()` for display.
