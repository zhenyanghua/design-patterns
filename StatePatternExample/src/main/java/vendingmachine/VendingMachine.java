package vendingmachine;

import java.util.Map;
import java.util.Random;

// State machine
public class VendingMachine {
    private State cardSwipedAcceptedState;
    private State cardSwipedRejectedState;
    private State itemSelectedState;
    private State soldState;
    private State soldOutState;

    private State state;
    private Map<String, Integer> inventory;
    private String item;
    private Random random;

    public VendingMachine(Map<String, Integer> inventory) {
        this.cardSwipedAcceptedState = new CardSwipedAcceptedState(this);
        this.cardSwipedRejectedState = new CardSwipedRejectedState(this);
        this.itemSelectedState = new ItemSelectedState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);

        this.state = cardSwipedRejectedState;
        this.inventory = inventory;
        this.random = new Random();
    }

    public void swipeCard() {
        state.swipeCard();
    }

    public void selectItem(String item) {
        state.selectItem(item);
    }

    public void confirm() {
        state.confirm();
        state.dispense();
    }

    public void cancel() {
        state.cancel();
    }

    void printInvalidOperation() {
        System.out.println("Invalid Operation");
    }

    boolean validateCard() {
        return random.nextInt(4) > 0;
    }

    void setState(final State state) {
        this.state = state;
    }

    public void printInventory() {
        inventory.forEach((s, integer) -> System.out.println(s + ": " + integer));
        System.out.println();
    }

    State getCardSwipedAcceptedState() {
        return cardSwipedAcceptedState;
    }

    State getCardSwipedRejectedState() {
        return cardSwipedRejectedState;
    }

    State getItemSelectedState() {
        return itemSelectedState;
    }

    State getSoldState() {
        return soldState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    Map<String, Integer> getInventory() {
        return inventory;
    }

    String getItem() {
        return item;
    }

    void setItem(final String item) {
        this.item = item;
    }
}
