import java.util.ArrayList;
import java.util.Scanner;

class Book {

    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return id + " - " + title;
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Library Management =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);
    }

    static void addBook() {

        System.out.print("Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Book Title: ");
        String title = sc.nextLine();

        books.add(new Book(id, title));

        System.out.println("Book Added Successfully");
    }

    static void viewBooks() {

        if(books.isEmpty()) {
            System.out.println("No Books Available");
            return;
        }

        for(Book book : books) {
            System.out.println(book);
        }
    }
}
