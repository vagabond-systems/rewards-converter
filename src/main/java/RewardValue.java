public class RewardValue {

    // Cash value of the reward
    private final double cashValue;

    // Conversion rate from miles to cash
    public static final double conversionRate = 0.0035;

    // Constructor taking cash value as input
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor taking miles value as input
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Private method to convert cash value to miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }

    // Private method to convert miles value to cash
    private static double convertToCash(int milesValue) {
        return milesValue * conversionRate;
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value, converting cash to miles
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
