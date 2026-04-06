public interface PaymentStrategy {
    void pay(Account from, Account to, double mode);
}
