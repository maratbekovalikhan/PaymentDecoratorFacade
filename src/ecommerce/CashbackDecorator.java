package ecommerce;

public class CashbackDecorator extends PaymentDecorator {
    private double cashbackPercent;

    public CashbackDecorator(Payment payment, double cashbackPercent) {
        super(payment);
        this.cashbackPercent = cashbackPercent;
    }

    @Override
    public void pay(double amount) {
        double cashback = amount * cashbackPercent / 100;
        super.pay(amount);
        System.out.println("Cashback credited: " + cashback);
    }
}
