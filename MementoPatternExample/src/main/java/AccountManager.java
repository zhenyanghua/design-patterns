import java.util.Stack;

// caretaker
public class AccountManager {
    private Stack<AccountMemento> accountHistory = new Stack<>();

    public void save(Account account) {
        accountHistory.push(account.save());
    }

    public void revert(Account account) {
        if (accountHistory.empty()) return;
        account.revert(accountHistory.pop());
    }
}
