package bookstore;

public class Book implements Media {
    private String title;
    private String author;
    private int pages;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public void setPages(final int pages) {
        this.pages = pages;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void accept(final MediaVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", pages=" + pages +
            ", isbn='" + isbn + '\'' +
            '}';
    }
}
