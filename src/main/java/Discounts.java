public class Discounts {
    private double discountRate; // Discount rate based on loyalty status

    public Discounts(double discountRate) {
        this.discountRate = discountRate;
    }

    public double applyDiscount(double orderTotal) {
        return orderTotal * (1 - discountRate);
    }
}
