package bookstore;

public class Music implements Media {
    private String title;
    private String singer;
    private String album;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(final String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(final String album) {
        this.album = album;
    }

    @Override
    public void accept(final MediaVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Music{" +
            "title='" + title + '\'' +
            ", singer='" + singer + '\'' +
            ", album='" + album + '\'' +
            '}';
    }
}
