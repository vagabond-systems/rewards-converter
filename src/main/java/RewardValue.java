// RewardValue Class - Represents correspondence between currencies (cash, miles, etc.)
public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor with cash value, converts from cash to miles
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) Math.round(cashValue / MILES_TO_CASH_CONVERSION_RATE);  // rounding
    }

    // Constructor with miles value, converts from miles to cash
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Getter for miles value
    public int getMilesValue() {
        return this.milesValue;
    }
}
