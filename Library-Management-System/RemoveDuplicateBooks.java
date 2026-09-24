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

    public String toString() {
        return "[" + bookId + "] " + title + " - Rs. " + price;
    }
}

public class RemoveDuplicateBooks {

    public static int removeDuplicates(Book[] books, int n) {
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (books[i].bookId != books[j].bookId) {
                j++;
                books[j] = books[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Mark", 400),
            new Book(101, "Data Structures", "Mark", 400),
            new Book(102, "Java Basics", "James", 300),
            new Book(103, "Python Guide", "Guido", 600),
            new Book(104, "Database Systems", "Raghu", 500),
            new Book(105, "Computer Networks", "Andrew", 700)
        };

        int count = removeDuplicates(books, books.length);

        System.out.println("Unique Books Count: " + count);

        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}