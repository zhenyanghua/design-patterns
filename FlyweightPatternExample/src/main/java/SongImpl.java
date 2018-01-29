public class SongImpl implements Song {
    private final String name;

    public SongImpl(final String name) {
        this.name = name;
    }

    public void play(final String specialEffect) {
        System.out.println("Now playing song [" + name + "] with the special effect [" + specialEffect + "]");
    }
}
