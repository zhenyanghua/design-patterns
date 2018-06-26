import vendingmachine.VendingMachine;

import java.util.HashMap;
import java.util.Map;

// Client
public class App {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Orange", 3);
        inventory.put("Banana", 2);

        VendingMachine vm = new VendingMachine(inventory);

        vm.printInventory();

        vm.selectItem("Orange");
        vm.confirm();
        vm.printInventory();

        vm.swipeCard();
        vm.selectItem("Orange");
        vm.confirm();
        vm.printInventory();

        vm.swipeCard();
        vm.selectItem("Orange");
        vm.cancel();
        vm.printInventory();

        vm.swipeCard();
        vm.selectItem("Orange");
        vm.confirm();
        vm.printInventory();

        vm.swipeCard();
        vm.selectItem("Orange");
        vm.confirm();
        vm.printInventory();
    }
}
