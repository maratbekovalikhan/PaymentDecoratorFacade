package ecommerce;

public class FraudDetectionDecorator extends PaymentDecorator {

    public FraudDetectionDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("🕵️ Проверка транзакции на подозрительную активность...");
        super.pay(amount);
        System.out.println("✅ Проверка завершена. Транзакция безопасна.");
    }
}
