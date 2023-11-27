public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double milesToCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * milesToCashRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return this.cashValue / milesToCashRate;
    }
}
