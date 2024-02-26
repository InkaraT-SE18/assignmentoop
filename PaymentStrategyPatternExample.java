import java.util.Scanner;
public class PaymentStrategyPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter credit card number: ");
            String cardNumber = scanner.next();
            System.out.print("Enter expiration date (MM/YY): ");
            String expirationDate = scanner.next();
            System.out.print("Enter CVV: ");
            String cvv = scanner.next();
            cart.setPaymentStrategy(new CreditCardPaymentStrategy(cardNumber, expirationDate, cvv));
        } else if (choice == 2) {
            System.out.print("Enter PayPal email: ");
            String email = scanner.next();
            System.out.print("Enter PayPal password: ");
            String password = scanner.next();
            cart.setPaymentStrategy(new PayPalPaymentStrategy(email, password));
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // Checkout with selected payment method
        System.out.print("Enter amount to pay: ");
        int amount = scanner.nextInt();
        cart.checkout(amount);

        scanner.close();
    }
}
