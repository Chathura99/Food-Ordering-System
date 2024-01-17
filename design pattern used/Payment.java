
public interface Payment {
    boolean processPayment(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public boolean processPayment(double amount) {
        // credit card
        return true;
    }
}

class DigitalWalletPayment implements Payment {
    @Override
    public boolean processPayment(double amount) {
        // digital wallet
        return true;
    }
}

class PaymentService {
    private Payment Payment;

    public PaymentService(Payment Payment) {
        this.Payment = Payment;
    }

    public void process(double amount) {
        Payment.processPayment(amount);
    }
}
