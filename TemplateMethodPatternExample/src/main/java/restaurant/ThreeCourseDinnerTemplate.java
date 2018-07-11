package restaurant;

public abstract class ThreeCourseDinnerTemplate {

    public final void order() {
        beforeStart();

        if (serveBeverage()) {
            makeBeverage();
        }

        makeStarter();
        makeEntry();
        makeDessert();

        afterFinish();
    }

    protected void beforeStart() {}

    protected void afterFinish() {}

    protected boolean serveBeverage() {
        return true;
    }

    protected abstract void makeBeverage();

    protected abstract void makeStarter();

    protected abstract void makeEntry();

    protected abstract void makeDessert();

}
