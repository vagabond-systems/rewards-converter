public class RewardValue {

    // Conversion rate: 1 mile = $0.0035
    private static final double MILES_TO_CASH_RATE = 0.0035;

    private double cashValue;  // Holds the cash value
    private double milesValue; // Holds the miles value

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE; // Convert cash to miles
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE; // Convert miles to cash
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
