package bookstore;

public class DetailPrintingVisitor implements MediaVisitor {
    private int bookCount;
    private int movieCount;
    private int musicCount;

    @Override
    public void visit(final Book book) {
        bookCount++;
        System.out.println(book);
        System.out.println("Book total: " + bookCount);
    }

    @Override
    public void visit(final Movie movie) {
        movieCount++;
        System.out.println(movie);
        System.out.println("Movie total: " + movieCount);
    }

    @Override
    public void visit(final Music music) {
        musicCount++;
        System.out.println(music);
        System.out.println("Music total: " + musicCount);
    }
}
