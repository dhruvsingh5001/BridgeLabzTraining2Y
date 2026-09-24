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

public class SearchBookByPrice {

    public static int searchByPrice(Book[] books, int count, double targetPrice) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (books[mid].price == targetPrice)
                return mid;

            if (books[mid].price < targetPrice)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(102, "Java Basics", 300),
            new Book(101, "Data Structures", 400),
            new Book(104, "Database Systems", 500),
            new Book(103, "Python Guide", 600),
            new Book(105, "Computer Networks", 700)
        };

        int index = searchByPrice(books, books.length, 500);

        if (index != -1)
            System.out.println("Book found at index " + index);
        else
            System.out.println("Book not found");
    }
}