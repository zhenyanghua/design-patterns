package restaurant;

public class SurfNTurfDinner extends ThreeCourseDinnerTemplate {

    private boolean serveHouseWine;

    public SurfNTurfDinner(final boolean serveHouseWine) {
        this.serveHouseWine = serveHouseWine;
    }

    @Override
    protected void beforeStart() {
        System.out.println("Making Surf and Turf Three Course Dinner.");
    }

    @Override
    protected void afterFinish() {
        System.out.println();
    }

    @Override
    protected boolean serveBeverage() {
        return serveHouseWine;
    }

    @Override
    protected void makeBeverage() {
        System.out.println("Pouring House Wine.");
    }

    @Override
    protected void makeStarter() {
        System.out.println("Serving French Onion Soup.");
    }

    @Override
    protected void makeEntry() {
        System.out.println("Serving Ribeye Steak and Scallop with White Corn.");
    }

    @Override
    protected void makeDessert() {
        System.out.println("Serving Watermelon with Feta Cheese");
    }
}
