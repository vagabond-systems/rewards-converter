public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructors
    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // conversion methods
    private static double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    private static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // getters
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }
}