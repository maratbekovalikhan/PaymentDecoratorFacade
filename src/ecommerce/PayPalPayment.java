package ecommerce;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment via PayPal: " + amount);
    }
}
