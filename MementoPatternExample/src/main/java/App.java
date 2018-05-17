import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        OperationManager manager = new OperationManager();

        Account account = new Account();

        account.setType("saving");
        account.setBalance(100);
        account.setOpenAtBranch("Village Hill");
        account.setOpenDate(LocalDate.now());
        System.out.println("Account before save: " + account);

        manager.save(account);

        account.deposit(100);
        manager.save(account);
        System.out.println("Account after deposit: " + account);

        account.withdraw(50);
        manager.save(account);
        System.out.println("Account after withdraw: " + account);

        account.deposit(100);
        System.out.println("Account after deposit and before save: " + account);
        manager.revert(account);
        System.out.println("Revert to last saved point: " + account);

        manager.revert(account);
        System.out.println("Revert to last saved point: " + account);
        manager.revert(account);
        System.out.println("Revert to the original: " + account);
    }
}
