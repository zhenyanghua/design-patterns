package bookstore;

public interface MediaVisitor {
    void visit(Book book);
    void visit(Movie movie);
    void visit(Music music);
}
