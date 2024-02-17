// Reward Value Class: cash-miles conversion
public class RewardValue {
    // #1.1 Cash value of the reward
    private final double cashValue;
    // #1.2 Conversion rate from miles to cash
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // #1.3 Constructor taking cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // #2.Constructor taking miles value and converting it to cash
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // #3. Convert cash value to miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // #4. Convert miles value to cash
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // #5. Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // #6. Get miles value
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
