public class Payment {
    private double amount;
    private String paymentMethod;
    private String status;

    public Payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = "Initialized";
    }

    public boolean processPayment() {
        this.status = "Processed";
        return true; 
    }

    public boolean refund() {
        this.status = "Refunded";
        return true; 
    }

    public boolean validatePaymentDetails() {
        return true; 
    }

    public String getPaymentStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
