public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double milesToCashConversionRate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }
    public double getCashValue() {
        double milesToCash = milesValue*milesToCashConversionRate;
        double totalCashValue = cashValue + milesToCash;
        return totalCashValue;
    }

    public int getMilesValue() {
        int cashToMiles = (int)(cashValue/milesToCashConversionRate);
        int totalMilesValue = milesValue + cashToMiles;
        return totalMilesValue;
    }
}
