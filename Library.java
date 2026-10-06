import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    HashMap<Integer, Book> bookMap = new HashMap<>();


    // Add Book
    public void addBook(Book book) {

        if (bookMap.containsKey(book.id)) {
            System.out.println("Book ID already exists!");
            return;
        }

        books.add(book);
        bookMap.put(book.id, book);

        System.out.println("Book added successfully!");
    }


    // Search Book by ID
    public Book searchById(int id) {

        return bookMap.get(id);
    }


    // Update Book
    public void updateBook(int id, String title, String author, String category) {

        Book book = bookMap.get(id);

        if (book != null) {

            book.title = title;
            book.author = author;
            book.category = category;

            System.out.println("Book updated successfully!");

        } else {

            System.out.println("Book not found!");
        }
    }


    // Delete Book
    public void deleteBook(int id) {

        Book book = bookMap.get(id);

        if (book != null) {

            books.remove(book);
            bookMap.remove(id);

            System.out.println("Book deleted successfully!");

        } else {

            System.out.println("Book not found!");
        }
    }


    // Display All Books
    public void displayBooks() {

        System.out.println("\n===== ALL BOOKS =====");

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
