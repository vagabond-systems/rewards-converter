public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that converts cash to miles
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Constructor that converts miles to cash
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Returns cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Returns miles value
    public int getMilesValue() {
        return this.milesValue;
    }
}
