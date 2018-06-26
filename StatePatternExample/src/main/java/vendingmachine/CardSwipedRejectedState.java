package vendingmachine;

// Concrete State
public class CardSwipedRejectedState implements State {
    private VendingMachine vm;

    CardSwipedRejectedState(final VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void swipeCard() {
        if (vm.validateCard()) {
            System.out.println("Card is accepted");
            vm.setState(vm.getCardSwipedAcceptedState());
        } else {
            System.out.println("Card is rejected");
        }
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
        vm.printInvalidOperation();
    }
}
