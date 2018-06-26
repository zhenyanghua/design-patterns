package vendingmachine;

// Concrete State
public class CardSwipedAcceptedState implements State {

    private VendingMachine vm;

    CardSwipedAcceptedState(final VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void swipeCard() {
        vm.printInvalidOperation();
    }

    @Override
    public void selectItem(final String item) {
        vm.setItem(item);
        if (vm.getInventory().containsKey(item)) {
            System.out.println(item + " is selected.");
            vm.setState(vm.getItemSelectedState());
        } else {
            vm.printInvalidOperation();
        }
    }

    @Override
    public void confirm() {
        vm.printInvalidOperation();
    }

    @Override
    public void cancel() {
        System.out.println("Transaction canceled.");
    }

    @Override
    public void dispense() {
        vm.printInvalidOperation();
    }
}
