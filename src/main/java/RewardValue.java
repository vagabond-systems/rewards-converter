public class RewardValue {
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private double milesValue;

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

    // Returns the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Returns the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
