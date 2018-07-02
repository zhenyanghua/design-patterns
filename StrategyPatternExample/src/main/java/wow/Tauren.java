package wow;

public class Tauren extends Race {
    public Tauren() {
        danceBehavior = new IrishDance();
        fightBehavior = new TaichiFight();
    }

    @Override
    public String[] getTraits() {
        return new String[] {
            "Brawn",
            "Cultivation",
            "Endurance",
            "Nature Resistance",
            "War Stomp"
        };
    }
}
