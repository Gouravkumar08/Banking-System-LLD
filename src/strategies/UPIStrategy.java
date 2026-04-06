package strategies;

import model.Account;

public class UPIStrategy implements PaymentStrategy {
    @Override
    public void pay(Account from, Account to, double amount) {
        if(from.getBalance()<amount){
            throw new IllegalArgumentException("Insufficient balance");
        }
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Successfully paid via UPI from AccNo :" +from.getAccountId() + " to AccNo :"  + to.getAccountId() );
    }
}
