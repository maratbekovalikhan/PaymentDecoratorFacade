package ecommerce;

public class CheckoutFacade {
    public void processOrder(Payment payment, double amount) {
        System.out.println("🛒 Начало оформления заказа...");
        payment.pay(amount);
        System.out.println("📨 Чек и уведомление отправлены клиенту.\n");
    }
}
