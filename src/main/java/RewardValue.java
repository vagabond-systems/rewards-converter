public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * conversionRate;
    }
    public RewardValue(int milesValue) {
        this.cashValue = milesValue / conversionRate;
        this.milesValue = milesValue;
    }
    public double getCashValue() {
        return this.cashValue;
    }
    public double getMilesValue() {
        return this.milesValue;
    }
}
