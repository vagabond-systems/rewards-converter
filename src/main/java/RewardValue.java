public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Method to convert cash to a value in miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Method to convert miles to a value in cash
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Returns the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Returns how many miles the RewardValue is worth
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}