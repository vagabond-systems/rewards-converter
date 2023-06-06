public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION = 0.0035;

    // Assigns the cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Converts the miles value to the cash value
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Converts the cash value to the number of miles
    public static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION);

    }

    // Converts the cash value to the number of miles
    public static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION;

    }

    // Returns the cash value of the reward
    public double getCashValue() {
        return cashValue;
    }

    // Returns the number of miles that can be obtained from the cashValue
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

}
