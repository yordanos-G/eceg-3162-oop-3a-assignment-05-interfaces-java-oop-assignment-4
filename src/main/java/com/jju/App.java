import java.util.ArrayList;
import java.util.List;

// Main driver class
public class Main {

    public static void main(String[] args) {

        // Create list of payment methods
        List<PaymentMethod> payments = new ArrayList<>();

        // Add payment methods
        payments.add(new CreditCard("1234-5678-9999"));
        payments.add(new PayPal("user@gmail.com"));

        // Process all payments
        for (PaymentMethod payment : payments) {
            payment.processPayment(99.99);
        }
    }
}
