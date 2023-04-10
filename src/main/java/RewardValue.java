public class RewardValue {
    private final double cashValue;
    // Conversion rate from miles to cash (1 mile = 0.0035 cash)
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Accepts a cash value and initializes the cashValue instance variable
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Accepts a value in miles, converts it to cash value, and initializes the cashValue instance variable
    public RewardValue(int milesValue) {
        this.cashValue = milesToCash(milesValue);
    }
}
