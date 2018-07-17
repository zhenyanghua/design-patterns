import bookstore.DetailPrintingVisitor;
import bookstore.Inventory;
import bookstore.TitlePrintingVisitor;

public class App {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        inventory.accept(new TitlePrintingVisitor());
        inventory.accept(new DetailPrintingVisitor());
    }
}
