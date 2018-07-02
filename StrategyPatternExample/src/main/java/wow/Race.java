package wow;

public abstract class Race {
    DanceBehavior danceBehavior;
    FightBehavior fightBehavior;

    public void dance() {
        danceBehavior.dance();
    }
    public void fight() {
        fightBehavior.fight();
    }

    public void setDanceBehavior(DanceBehavior danceBehavior) {
        this.danceBehavior = danceBehavior;
    }
    public void setFightBehavior(FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public abstract String[] getTraits();
}
