package ecommerce;

public class FraudDetectionDecorator extends PaymentDecorator {

    public FraudDetectionDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Checking transaction for suspicious activity...");
        super.pay(amount);
        System.out.println("Security check completed. Transaction is safe.");
    }
}
