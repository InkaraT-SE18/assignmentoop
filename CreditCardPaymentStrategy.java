class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        // Implement payment logic using credit card
        System.out.println("Paid " + amount + " using credit card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}
