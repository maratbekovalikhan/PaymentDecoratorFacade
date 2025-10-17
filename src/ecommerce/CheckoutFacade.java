package ecommerce;

public class CheckoutFacade {
    public void processOrder(Payment payment, double amount) {
        System.out.println("Order processing started...");
        payment.pay(amount);
        System.out.println("Receipt and notification have been sent to the customer.\n");
    }
}
