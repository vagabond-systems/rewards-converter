public class RewardValue {
    private final double cashValues;
    private final int milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor with cash value, converts from cash to miles
    public RewardValue(double cashValues) {
        this.cashValues = cashValues;
        this.milesValue = (int) (cashValues / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Constructor with miles value, converts from miles to cash
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValues = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for cash value
    public double getCashValue() {
        return this.cashValues;
    }

    // Getter for miles value
    public int getMilesValue() {
        return this.milesValue;
    }
}