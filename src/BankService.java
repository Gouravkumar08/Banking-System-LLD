import java.util.HashMap;
import java.util.Map;

public class BankService {
    Map<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int accNo, String holderName) {
        if (accounts.containsKey(accNo)) {
            throw new IllegalArgumentException("Account with this number already exists");
        }
        accounts.put(accNo, new Account(accNo, holderName));
        System.out.println("Account created: " + accNo);
    }

    public void deposit(int accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            accounts.get(accNo).deposit(amount);
            System.out.println("Deposit successful: " + amount);
            return;
        }
        throw new IllegalArgumentException("Account not found");
    }

    public void transfer(int from, int to, double amount, String mode) {
        Account sender = accounts.get(from);
        Account receiver = accounts.get(to);

        if (sender == null) {
            throw new IllegalArgumentException("Sender account not found: " + from);
        }
        if (receiver == null) {
            throw new IllegalArgumentException("Receiver account not found: " + to);
        }

        PaymentStrategy strategy = PaymentStrategyFactory.getStrategy(mode);
        strategy.pay(sender, receiver, amount);
    }

    public void withdraw(int accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            accounts.get(accNo).withdraw(amount);
            System.out.println("Withdrawal successful: " + amount);
            return;
        }
        throw new IllegalArgumentException("Account doesn't exist");
    }

    public void checkBalance(int accNo) {
        if (accounts.containsKey(accNo)) {
            System.out.println("Balance: " + accounts.get(accNo).getBalance());
            return;
        }
        throw new IllegalArgumentException("Account doesn't exist");
    }

    public void accountDetails(int accNo) {
        if (!accounts.containsKey(accNo)) {
            throw new IllegalArgumentException("Account doesn't exist");
        }
        System.out.println(accounts.get(accNo).details());
    }

    public void allTransactions(int accNo) {
        if (!accounts.containsKey(accNo)) {
            throw new IllegalArgumentException("Account doesn't exist");
        }
        accounts.get(accNo).getTransactions();
    }
}