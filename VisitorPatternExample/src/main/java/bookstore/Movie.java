package bookstore;

public class Movie implements Media {
    private String title;
    private String isbn;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    @Override
    public void accept(final MediaVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Movie{" +
            "title='" + title + '\'' +
            ", isbn='" + isbn + '\'' +
            ", year=" + year +
            '}';
    }
}
