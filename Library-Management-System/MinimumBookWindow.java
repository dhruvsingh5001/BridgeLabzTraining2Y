class Book {
    double price;

    Book(double price) {
        this.price = price;
    }
}

public class MinimumBookWindow {

    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {
        int left = 0;
        double sum = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < count; right++) {
            sum += books[right].price;

            while (sum >= targetCost) {
                min = Math.min(min, right - left + 1);
                sum -= books[left].price;
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(300),
            new Book(400),
            new Book(500),
            new Book(600),
            new Book(700)
        };

        int result = minBooksForTargetCost(books, books.length, 1000);

        System.out.println("Minimum Consecutive Books Needed: " + result);
    }
}