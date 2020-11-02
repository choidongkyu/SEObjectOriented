package academy.pocu.comp2500.lab7;

import java.util.HashSet;

public class Bundle {
    private String title;
    private HashSet<Book> books;

    public Bundle(String title) {
        this.title = title;
        books = new HashSet<>();
    }

    public boolean add(Book book) {
        return books.add(book);
    }

    public boolean remove(Book book) {
        return books.remove(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !(o instanceof Bundle) || this.hashCode() != o.hashCode()) {
            return false;
        }
        Bundle other = (Bundle) o;
        return this.books.equals(other.books) && this.title.equals(other.title);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + title.hashCode();
        result = result * 31 + books.hashCode();
        return result;
    }
}
