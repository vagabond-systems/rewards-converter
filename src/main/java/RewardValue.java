public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Conversion rate from miles to cash
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);  // Convert cash to miles
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;  // Convert miles to cash
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return this.milesValue;
    }
}
