package vendingmachine;

// Concrete State
public class ItemSelectedState implements State {
    private VendingMachine vm;

    ItemSelectedState(final VendingMachine vm) {
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
        if (vm.getInventory().get(vm.getItem()) > 0) {
            System.out.println(vm.getItem() + " is confirmed. Wait for dispensing.");
            vm.setState(vm.getSoldState());
        } else {
            System.out.println(vm.getItem() + " is out of stock.");
            vm.setState(vm.getSoldOutState());
        }
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
