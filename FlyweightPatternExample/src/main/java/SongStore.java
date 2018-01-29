import java.util.HashMap;
import java.util.Map;

public class SongStore {
    private SongStore() {
        new AssertionError();
    }

    public static Map<String, Song> songs = new HashMap<>();

    public static Song lookup(String name) {
        if (!songs.containsKey(name)) {
            songs.put(name, new SongImpl(name));
        }
        return songs.get(name);
    }

    public static void printTotalSongsCreated() {
        System.out.println("Total songs created: " + songs.size());
    }
}
