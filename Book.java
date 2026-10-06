public class Book {

    int id;
    String title;
    String author;
    String category;

    public Book(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " + author + " | " + category;
    }
}
