class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}

public class SortBooksByPrice {

    public static void sortByPrice(Book[] books, int count) {
        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {
            int min = i;

            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[min].price)
                    min = j;
            }

            if (min != i) {
                Book temp = books[i];
                books[i] = books[min];
                books[min] = temp;
                swaps++;
            }
        }

        System.out.println("Total Swaps: " + swaps);
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", 400),
            new Book(102, "Java Basics", 300),
            new Book(103, "Python Guide", 600),
            new Book(104, "Database Systems", 500),
            new Book(105, "Computer Networks", 700)
        };

        sortByPrice(books, books.length);

        for (Book b : books)
            System.out.println(b.bookId + " " + b.title + " - Rs. " + b.price);
    }
}