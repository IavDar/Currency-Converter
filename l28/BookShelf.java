package l28;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

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
            @Override
            public String toString() {
                return title + " by " + author + ", " + year;
            }
            public String getTitle() {
                return title;
            }

        }

        public void addBook(String title, String author, int year) {
            Book book = new Book(title, author, year);
            books.add(book);
            System.out.println("Книга " + title + " добавлена на полку");
        }


        public void removeBook(String bookToRemove)
        {
            for (int i = 0; i < books.size(); i++) {
                Book currentBook = books.get(i);

                if (currentBook.getTitle().equals(bookToRemove))
                {
                    books.remove(i);
                    System.out.println("Книга " + bookToRemove + " удалена с полки");
                    return;
                }
            }
        }


        class BookIterator implements Iterator<Book> {

            int current = 0;

            @Override
            public boolean hasNext() {
                return current < books.size();
            }

            @Override
            public Book next() {
                Book book = books.get(current);
                current++;
                return book;
            }
        }

        public BookIterator getIterator() {
            return new BookIterator();
        }

    }