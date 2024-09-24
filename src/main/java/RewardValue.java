  // Make sure this matches the actual package name

public class RewardValue {
    // Conversion rate from miles to cash
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Store the value in cash or miles
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;  // Convert cash to miles
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;  // Convert miles to cash
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return this.milesValue;
    }
}

