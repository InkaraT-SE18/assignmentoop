class PayPalPaymentStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        // Implement payment logic using PayPal
        System.out.println("Paid " + amount + " using PayPal account " + email);
    }
}