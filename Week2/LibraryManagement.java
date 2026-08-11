import java.util.ArrayList;

abstract class LibraryMember {

    protected String name;

    LibraryMember(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void borrowBook(Book book);

    // Normal method
    void displayName() {
        System.out.println("Member Name: " + name);
    }
}


class Book {

    // Encapsulation
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    // Constructor
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    // Getters
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
        return available;
    }

    // Setter
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display book information
    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

        if (available) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Borrowed");
        }

        System.out.println("----------------------");
    }
}



class User extends LibraryMember {

    private int userId;

    User(int userId, String name) {
        super(name);
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    // Implementing abstract method
    @Override
    void borrowBook(Book book) {

        if (book.isAvailable()) {

            book.setAvailable(false);

            System.out.println(
                name + " borrowed \"" +
                book.getTitle() + "\""
            );

        } else {

            System.out.println(
                "Book is not available."
            );
        }
    }
}



class StudentUser extends User {

    StudentUser(int userId, String name) {
        super(userId, name);
    }

    // Overriding method
    @Override
    void borrowBook(Book book) {

        if (book.isAvailable()) {

            book.setAvailable(false);

            System.out.println(
                "Student " + name +
                " borrowed \"" +
                book.getTitle() + "\""
            );

        } else {

            System.out.println(
                "Book is already borrowed."
            );
        }
    }
}



class Library {

    private ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    // Add Book
    void addBook(Book book) {

        books.add(book);

        System.out.println(
            "Book added successfully: " +
            book.getTitle()
        );
    }

    // Display all books
    void displayBooks() {

        System.out.println("\n===== Library Books =====");

        if (books.isEmpty()) {

            System.out.println("No books available.");

        } else {

            for (Book book : books) {
                book.displayBook();
            }
        }
    }

    // Return Book
    void returnBook(Book book) {

        if (!book.isAvailable()) {

            book.setAvailable(true);

            System.out.println(
                "\"" + book.getTitle() +
                "\" returned successfully."
            );

        } else {

            System.out.println(
                "This book was not borrowed."
            );
        }
    }
}



public class LibraryManagement {

    public static void main(String[] args) {

        // Create Library
        Library library = new Library();

        // Create Books
        Book book1 = new Book(
            101,
            "Java Programming",
            "James Gosling"
        );

        Book book2 = new Book(
            102,
            "Clean Code",
            "Robert Martin"
        );

        Book book3 = new Book(
            103,
            "Data Structures",
            "Mark Allen"
        );

        // Add books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display books
        library.displayBooks();

        // Create Student User
        StudentUser student =
            new StudentUser(1, "Kanishka");

        System.out.println("\n===== Borrow Book =====");

        student.displayName();

        // Borrow book
        student.borrowBook(book1);

        // Try borrowing same book
        System.out.println("\nTrying to borrow the same book again:");

        student.borrowBook(book1);

        // Display books
        library.displayBooks();

        // Return book
        System.out.println("\n===== Return Book =====");

        library.returnBook(book1);

        // Display books again
        library.displayBooks();
    }
}
