package bookstore;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements Media {

    private List<Media> media = new ArrayList<>();

    public Inventory() {
        Book book = new Book();
        book.setAuthor("JKR");
        book.setTitle("Harry Potter and the Order of Phoenix");
        book.setIsbn("1287362812082");
        book.setPages(1162);

        Movie movie = new Movie();
        movie.setTitle("Titanic");
        movie.setIsbn("29283747122");
        movie.setYear(1997);

        Music music = new Music();
        music.setTitle("Sweet Caroline");
        music.setSinger("Neil Diamond");
        music.setAlbum("Sweet Caroline");

        Music song = new Music();
        song.setTitle("I Dreamed a Dream");
        song.setSinger("Hayley Westenra");
        song.setAlbum("Open Concert");

        media.add(book);
        media.add(movie);
        media.add(music);
        media.add(song);
    }

    @Override
    public void accept(final MediaVisitor visitor) {
        media.forEach(x -> x.accept(visitor));
    }
}
