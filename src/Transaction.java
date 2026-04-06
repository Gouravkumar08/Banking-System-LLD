import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private TransactionType type;
    private double amount;
    private LocalDateTime time;

    public Transaction(String id, TransactionType type, double amount, LocalDateTime time) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.time = time;
    }

    public String toString() {
        return type + ": " + amount + " at " + time;
    }
}