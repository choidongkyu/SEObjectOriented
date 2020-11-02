package academy.pocu.comp2500.lab7;

public class Book {
    private String title;
    private Author author;
    private int year;
    private Genre genre;

    public Book(String title, Author author, int year, Genre genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", title, author.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !(o instanceof Book) || this.hashCode() != o.hashCode()) {
            return false;
        }
        Book other = (Book) o;
        return this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.year == other.year &&
                this.genre == other.genre;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + title.hashCode();
        result = result * 31 + author.hashCode();
        result = result * 31 + year;
        result = result * 31 + genre.hashCode();
        return result;
    }
}
