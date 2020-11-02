package academy.pocu.comp2500.lab7;

import java.util.ArrayList;

public class ReadingList {
    private String title;
    private ArrayList<Book> books;

    public ReadingList(String title) {
        this.title = title;
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public boolean remove(Book book) {
        return books.remove(book);
    }

    @Override
    public String toString() {
        String result = "";
        int i = 1;
        for (Book book : books) {
            result += String.format("%d. %s%s", i, book.toString(), System.lineSeparator());
            ++i;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !(o instanceof ReadingList) || this.hashCode() != o.hashCode()) {
            return false;
        }
        ReadingList other = (ReadingList) o;
        return this.title.equals(other.title) &&
                this.books.equals(other.books);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 32 + title.hashCode();
        result = result * 32 + books.hashCode();
        return result;
    }
}
