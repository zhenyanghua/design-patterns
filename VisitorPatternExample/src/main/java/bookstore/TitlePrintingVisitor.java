package bookstore;

public class TitlePrintingVisitor implements MediaVisitor {
    @Override
    public void visit(final Book book) {
        System.out.println("Book title: " + book.getTitle());
    }

    @Override
    public void visit(final Movie movie) {
        System.out.println("Movie title: " + movie.getTitle());
    }

    @Override
    public void visit(final Music music) {
        System.out.println("Music title: " + music.getTitle());
    }
}
