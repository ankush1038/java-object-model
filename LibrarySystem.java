import java.util.ArrayList;

// Class representing a Book
class Book {

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Class representing a Library
class Library {

    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayLibraryBooks() {
        System.out.println("Library: " + name);

        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Main class to demonstrate aggregation
public class LibrarySystem {

    public static void main(String[] args) {

        // Creating book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Adding books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        // Displaying books in each library
        library1.displayLibraryBooks();

        System.out.println();

        library2.displayLibraryBooks();
    }
}
