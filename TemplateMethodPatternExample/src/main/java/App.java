import restaurant.SurfNTurfDinner;
import restaurant.ThreeCourseDinnerTemplate;
import restaurant.VegetarianDinner;

public class App {
    public static void main(String[] args) {
        ThreeCourseDinnerTemplate surfNTurf = new SurfNTurfDinner(true);
        surfNTurf.order();

        ThreeCourseDinnerTemplate vege = new VegetarianDinner(true);
        vege.order();
    }
}
