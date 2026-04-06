public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(Account from, Account to, double amount) {
        if(from.getBalance()<amount){
            throw new IllegalArgumentException("Insufficient balance");
        }
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Successfully paid via Card");
    }
}
