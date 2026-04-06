package strategies;

public class PaymentStrategyFactory {
    public static PaymentStrategy getStrategy(String type){
        switch(type.toUpperCase()){
            case "UPI" :
                return new UPIStrategy();
            case "CARD" :
                return new CreditCardStrategy();

            default:throw new IllegalArgumentException("Invalid payment method");
        }

    }
}
