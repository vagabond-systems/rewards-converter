public class RewardValue {
    private final double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int miles) {
        this.cashValue = convertToCash(miles);
    }

    // Method to convert miles to cash
    private static double convertToCash(int miles) {
        return miles * CONVERSION_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return convertToMiles(cashValue);
    }

    // Method to convert cash to miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }
}
