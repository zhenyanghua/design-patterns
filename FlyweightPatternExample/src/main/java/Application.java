public class Application {

    public static void main(String[] args) {
        Song songSweetCaroline_1 = SongStore.lookup("Sweet Caroline");
        songSweetCaroline_1.play("Soft Rock");

        Song songSweetCaroline_2 = SongStore.lookup("Sweet Caroline");
        songSweetCaroline_2.play("Pop");

        Song songBrownEyeGirl_1 = SongStore.lookup("Brown eyed girl");
        songBrownEyeGirl_1.play("Rock");

        Song songBrownEyeGirl_2 = SongStore.lookup("Brown eyed girl");
        songBrownEyeGirl_2.play("Pop");

        SongStore.printTotalSongsCreated();
    }
}
