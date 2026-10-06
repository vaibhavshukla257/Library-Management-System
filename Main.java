import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while (true) {

            System.out.println("\n========================================");
            System.out.println(" LIBRARY BOOK SEARCH & MANAGEMENT SYSTEM");
            System.out.println("========================================");

            System.out.println("1. Add Book");
            System.out.println("2. Search Book by ID");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Display All Books");
            System.out.println("5. Update Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Sort Books");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {


                // =========================
                // ADD BOOK
                // =========================

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    Book book = new Book(
                            id,
                            title,
                            author,
                            category
                    );

                    library.addBook(book);

                    break;


                // =========================
                // SEARCH BY ID
                // =========================

                case 2:

                    System.out.print("Enter Book ID to search: ");

                    int searchId = sc.nextInt();

                    Book foundBook = library.searchById(searchId);

                    if (foundBook != null) {

                        System.out.println("\nBook Found!");
                        System.out.println(foundBook);

                    } else {

                        System.out.println("\nBook Not Found!");
                    }

                    break;


                // =========================
                // SEARCH BY TITLE
                // =========================

                case 3:

                    System.out.print("Enter Book Title to search: ");

                    String searchTitle = sc.nextLine();

                    // Sort first because Binary Search
                    // requires sorted data

                    SearchAlgorithms.sortBooks(library.books);

                    Book titleResult =
                            SearchAlgorithms.binarySearch(
                                    library.books,
                                    searchTitle
                            );

                    if (titleResult != null) {

                        System.out.println("\nBook Found!");
                        System.out.println(titleResult);

                    } else {

                        System.out.println("\nBook Not Found!");
                    }

                    break;


                // =========================
                // DISPLAY ALL BOOKS
                // =========================

                case 4:

                    library.displayBooks();

                    break;


                // =========================
                // UPDATE BOOK
                // =========================

                case 5:

                    System.out.print("Enter Book ID to update: ");

                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Author: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter New Category: ");
                    String newCategory = sc.nextLine();

                    library.updateBook(
                            updateId,
                            newTitle,
                            newAuthor,
                            newCategory
                    );

                    break;


                // =========================
                // DELETE BOOK
                // =========================

                case 6:

                    System.out.print("Enter Book ID to delete: ");

                    int deleteId = sc.nextInt();

                    library.deleteBook(deleteId);

                    break;


                // =========================
                // SORT BOOKS
                // =========================

                case 7:

                    SearchAlgorithms.sortBooks(library.books);

                    System.out.println("Books sorted successfully!");

                    break;


                // =========================
                // EXIT
                // =========================

                case 8:

                    System.out.println(
                            "Thank you for using Library System!"
                    );

                    sc.close();

                    return;


                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}