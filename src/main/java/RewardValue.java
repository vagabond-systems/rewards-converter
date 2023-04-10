public class RewardValue {
    private final double cashValue;
    // Conversion rate from miles to cash (1 mile = 0.0035 cash)
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Accepts a cash value and initializes the cashValue instance variable
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Accepts a value in miles, converts it to cash value, and initializes the cashValue instance variable
    public RewardValue(int milesValue) {
        this.cashValue = milesToCash(milesValue);
    }

    // Takes a cash value and returns the equivalent miles value
    private static int cashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Takes a miles value and returns the equivalent cash value
    private static double milesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Returns the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Returns the miles value of the RewardValue by converting the cash value to miles
    public int getMilesValue() {
        return cashToMiles(this.cashValue);
    }
}
