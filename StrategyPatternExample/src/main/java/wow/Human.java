package wow;

public class Human extends Race {
    public Human() {
        danceBehavior = new SwingDance();
        fightBehavior = new SpellFight();
    }

    @Override
    public String[] getTraits() {
        return new String[] {
            "Every Man for Himself",
            "Diplomacy",
            "The Human Spirit"
        };
    }
}
