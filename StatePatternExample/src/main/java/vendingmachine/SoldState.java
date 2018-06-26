package vendingmachine;

// Concrete State
public class SoldState implements State {
    private VendingMachine vm;

    SoldState(final VendingMachine vm) {
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
        vm.printInvalidOperation();
    }

    @Override
    public void dispense() {
        vm.getInventory().put(vm.getItem(), vm.getInventory().get(vm.getItem()) - 1);
        System.out.println("Dispensing " + vm.getItem() + "...");
        vm.setState(vm.getCardSwipedRejectedState());
    }
}
