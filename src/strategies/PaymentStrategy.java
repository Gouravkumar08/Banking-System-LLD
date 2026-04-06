package strategies;

import model.Account;

public interface PaymentStrategy {
    void pay(Account from, Account to, double mode);
}
