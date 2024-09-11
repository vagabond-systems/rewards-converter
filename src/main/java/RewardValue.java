public class RewardValue {

    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor to accept a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;  // Convert cash to miles
    }

    // Constructor to accept a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;  // Convert miles to cash
    }

    // Method to return the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to return the miles value
    public double getMilesValue() {
        return this.milesValue;
    }
}