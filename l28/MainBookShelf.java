package l28;

public class MainBookShelf {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook("Psychology", "Oliver Bridge", 2018);
        bookShelf.addBook("Economy", "John Smith", 2020);
        bookShelf.addBook("Sociology", "Angela Stone", 2024);
        System.out.println();

        bookShelf.infoBooks();

    }
}
