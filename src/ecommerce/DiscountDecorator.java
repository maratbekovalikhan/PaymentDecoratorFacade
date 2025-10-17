package ecommerce;

public class DiscountDecorator extends PaymentDecorator {
    private double discountPercent;

    public DiscountDecorator(Payment payment, double discountPercent) {
        super(payment);
        this.discountPercent = discountPercent;
    }

    @Override
    public void pay(double amount) {
        double discounted = amount - (amount * discountPercent / 100);
        System.out.println("Discount applied: " + discountPercent + "%");
        super.pay(discounted);
    }
}
