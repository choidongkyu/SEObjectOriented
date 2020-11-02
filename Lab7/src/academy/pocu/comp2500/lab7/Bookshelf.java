package academy.pocu.comp2500.lab7;

import java.util.ArrayList;

public class Bookshelf {
    private int maxCount;
    private int count;
    private ArrayList<Book> books;

    public Bookshelf(int maxCount) {
        this.maxCount = maxCount;
        books = new ArrayList<>();
    }

    public boolean add(Book book) {
        if (count >= maxCount) {
            return false;
        }
        if (books.add(book)) {
            ++count;
            return true;
        }
        return false;
    }

    public boolean remove(Book book) {
        if (count <= 0) {
            return false;
        }
        if (books.remove(book)) {
            --count;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }
}
