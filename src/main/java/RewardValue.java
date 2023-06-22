public class RewardValue {
    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCashValue(milesValue);
    }
    private static double convertToCashValue(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION;
    }
    private static int convertToMilesValue(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION);
    }
    public double getMilesValue() {
        return convertToMilesValue(this.cashValue);
    }
    public double getCashValue() {
        return cashValue;
    }
}
