import restaurant.SurfNTurfDinner;
import restaurant.ThreeCourseDinnerTemplate;
import restaurant.VegetarianDinner;

public class App {
    public static void main(String[] args) {
        System.out.println("Making Surf and Turf Three Course Dinner.");
        ThreeCourseDinnerTemplate surfNTurf = new SurfNTurfDinner(true);
        surfNTurf.order();

        System.out.println();

        System.out.println("Making Vegetarian Three Course Dinner.");
        ThreeCourseDinnerTemplate vege = new VegetarianDinner(true);
        vege.order();
    }
}
