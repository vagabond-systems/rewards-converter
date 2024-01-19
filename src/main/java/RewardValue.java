public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Method to get the cash value
    public long getCashValue() {
        return Math.round(cashValue);
    }

    // Method to get the miles value
    public long getMilesValue() {
        return Math.round(milesValue);
    }
}
