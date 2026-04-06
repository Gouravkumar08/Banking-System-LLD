import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
    private int accountId;
    private String holderName;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(int accountId, String holderName) {
        this.accountId = accountId;
        this.holderName = holderName;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void getTransactions() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction(
                UUID.randomUUID().toString(),
                TransactionType.WITHDRAW,
                amount,
                LocalDateTime.now()
        ));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(
                UUID.randomUUID().toString(),
                TransactionType.DEPOSIT,
                amount,
                LocalDateTime.now()
        ));
    }

    public String details() {
        return "Account number: " + accountId + ", Account holder name: " + holderName;
    }
}