import java.time.LocalDate;

// Memento
public class AccountMemento {
    private String type;
    private LocalDate openDate;
    private int balance;

    public AccountMemento(final String type, final LocalDate openDate, final int balance) {
        this.type = type;
        this.openDate = openDate;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public int getBalance() {
        return balance;
    }
}
