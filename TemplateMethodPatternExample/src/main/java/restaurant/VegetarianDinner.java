package restaurant;

public class VegetarianDinner extends ThreeCourseDinnerTemplate {
    private boolean serverHouseCucumberJuice;

    public VegetarianDinner(final boolean serverHouseCucumberJuice) {
        this.serverHouseCucumberJuice = serverHouseCucumberJuice;
    }

    @Override
    protected boolean serveBeverage() {
        return serverHouseCucumberJuice;
    }

    @Override
    protected void makeBeverage() {
        System.out.println("Extracting House Cucumber Juice.");
    }

    @Override
    protected void makeStarter() {
        System.out.println("Serving House Salad.");
    }

    @Override
    protected void makeEntry() {
        System.out.println("Serving Portobello Mushroom Ravioli.");
    }

    @Override
    protected void makeDessert() {
        System.out.println("Serving Banana Split.");
    }
}
