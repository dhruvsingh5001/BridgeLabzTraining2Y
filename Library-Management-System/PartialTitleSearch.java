class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class PartialTitleSearch {

    public static void searchByTitle(Book[] books, int count, String query) {
        query = query.toLowerCase();

        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(query)) {
                System.out.println("- Found: [" + books[i].bookId + "] "
                        + books[i].title + " (Rs. " + books[i].price + ")");
            }
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Mark", 400),
            new Book(102, "Java Basics", "James", 300),
            new Book(103, "Python Guide", "Guido", 600),
            new Book(104, "Database Systems", "Raghu", 500)
        };

        searchByTitle(books, books.length, "data");
    }
}