// PayPal payment class
public class PayPal implements PaymentMethod {

    // Store PayPal email
    private String email;

    // Constructor
    public PayPal(String email) {
        this.email = email;
    }

    // Process payment using PayPal
    @Override
    public void processPayment(double amount) {
        System.out.println("Redirecting $" + amount + " to PayPal account: " + email);
    }
}
