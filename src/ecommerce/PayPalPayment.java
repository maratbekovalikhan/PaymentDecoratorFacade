package ecommerce;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal: " + amount + " ₸");
    }
}
