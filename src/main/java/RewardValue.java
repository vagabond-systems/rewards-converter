public class RewardValue {

    // Declare Variables
    private final double cashValue;
    private static final double CONVERSION_RATE = 0.0035; // Constants should be in uppercase

    // Constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Methods
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }
}
