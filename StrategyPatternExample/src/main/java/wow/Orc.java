package wow;

public class Orc extends Race {
    public Orc() {
        danceBehavior = new IrishDance();
        fightBehavior = new BoxFight();
    }

    @Override
    public String[] getTraits() {
        return new String[] {
            "Blood Fury",
            "Hardiness",
            "Command"
        };
    }
}
