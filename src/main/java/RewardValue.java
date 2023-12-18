public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private final double cashValue;

    // ****************
    // Constructors
    // ****************
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // *************
    // Methods
    // *************
    // - Convert miles to cash.
    public double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
    // - Converts cash to miles.
    public int convertToMiles(double cashValue) {
        return (int)(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}
