public class RewardValue {
    private final double cashValue;
    public static final double milesToCashConversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesToCash(milesValue);
    }

    private static int cashToMiles(double cashValue) {
        return (int) (cashValue / milesToCashConversionRate);
    }

    private static double milesToCash(int milesValue) {
        return milesValue * milesToCashConversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return cashToMiles(this.cashValue);
    }
}