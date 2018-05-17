import java.time.LocalDate;

// Originator
public class Account {
    private String type;
    private LocalDate openDate;
    private String openAtBranch;
    private int balance;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(final LocalDate openDate) {
        this.openDate = openDate;
    }

    public String getOpenAtBranch() {
        return openAtBranch;
    }

    public void setOpenAtBranch(final String openAtBranch) {
        this.openAtBranch = openAtBranch;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(final int balance) {
        this.balance = balance;
    }

    public int withdraw(int num) {
        if (balance >= num) {
            balance = balance - num;
        }

        return balance;
    }

    public int deposit(int num) {
        balance = balance + num;

        return balance;
    }

    public AccountMemento save() {
        return new AccountMemento(type, openDate, balance);
    }

    public void revert(AccountMemento account) {
        type = account.getType();
        openDate = account.getOpenDate();
        balance = account.getBalance();
    }

    @Override
    public String toString() {
        return "Account{" +
            "type='" + type + '\'' +
            ", openDate=" + openDate +
            ", openAtBranch='" + openAtBranch + '\'' +
            ", balance=" + balance +
            '}';
    }
}
