// Credit card payment class
public class CreditCard implements PaymentMethod {

    // Store card number
    private String cardNumber;

    // Constructor
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Process payment using credit card
    @Override
    public void processPayment(double amount) {
        System.out.println("Charging $" + amount + " to Card: " + cardNumber);
    }
}
