package l28;
import java.util.ArrayList;
import java.util.List;

class BookShelf {

        private List<Book> books = new ArrayList<>();

        static class Book {
            String title;
            String author;
            int year;

            Book(String title, String author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
            }

            public String getTitle() {
                return title;
            }

            public String getAuthor() {
                return author;
            }

            public int getYear() {
                return year;
            }
        }

        public void addBook(String title, String author, int year) {
            Book book = new Book(title, author, year);
            books.add(book);
            System.out.println("Книга " + title + " добавлена на полку");
        }

        public void infoBooks() {
            System.out.println("Книги на полке: \n");
            for (Book book : books) {
                System.out.println("Название: " + book.getTitle() + " Автор: " + book.getAuthor()
                        + " Год издания: " + book.getYear());
            }
        }

    }

