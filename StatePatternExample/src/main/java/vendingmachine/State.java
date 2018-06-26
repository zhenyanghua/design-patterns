package vendingmachine;

// State
public interface State {
    void swipeCard();
    void selectItem(String item);
    void confirm();
    void cancel();
    void dispense();
}
