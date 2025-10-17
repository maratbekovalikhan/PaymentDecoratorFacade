package ecommerce;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой: " + amount + " ₸");
    }
}
