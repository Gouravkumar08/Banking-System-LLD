public class Main {
    public static void main(String[] args) {
        BankService bank = new BankService();
        System.out.println("---------- Bank ----------");

        bank.createAccount(101, "Gourav Kumar");
        bank.deposit(101, 14000);

        bank.createAccount(102, "Rahul");

        bank.transfer(101, 102, 2000, "upi");
        bank.withdraw(101, 500);
        bank.checkBalance(102);

        bank.deposit(101, 10000);
        bank.checkBalance(101);

        bank.accountDetails(101);
        bank.allTransactions(101);
    }
}