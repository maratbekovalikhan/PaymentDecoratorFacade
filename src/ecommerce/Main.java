package ecommerce;

public class Main {
    public static void main(String[] args) {
        CheckoutFacade facade = new CheckoutFacade();

        // CreditCard с Discount + FraudDetection
        Payment creditCard = new CreditCardPayment();
        creditCard = new DiscountDecorator(creditCard, 10);
        creditCard = new FraudDetectionDecorator(creditCard);
        facade.processOrder(creditCard, 10000);

        // PayPal с Cashback
        Payment paypal = new PayPalPayment();
        paypal = new CashbackDecorator(paypal, 5);
        facade.processOrder(paypal, 20000);
    }
}
