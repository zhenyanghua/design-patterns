package vendingmachine;

// Concrete State
public class SoldOutState implements State {
    private VendingMachine vm;

    SoldOutState(final VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void swipeCard() {
        vm.printInvalidOperation();
    }

    @Override
    public void selectItem(final String item) {
        vm.printInvalidOperation();
    }

    @Override
    public void confirm() {
        vm.printInvalidOperation();
    }

    @Override
    public void cancel() {
        System.out.println("Transaction canceled.");
        vm.setState(vm.getCardSwipedRejectedState());
    }

    @Override
    public void dispense() {
        vm.printInvalidOperation();
    }
}
