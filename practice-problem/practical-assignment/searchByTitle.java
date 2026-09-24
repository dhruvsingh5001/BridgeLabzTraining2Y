public static void searchByTitle(Book[] books, int count, String query) {
    for (int i = 0; i < count; i++) {
        if (books[i].title.toLowerCase().contains(query.toLowerCase())) {
            System.out.println(books[i].title);
        }
    }
}