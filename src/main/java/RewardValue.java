public class RewardValue {
    private final double cashValue;
    public static final double MilesConversionRate = 0.0035D;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.cashValue = miles/MilesConversionRate;
    }

    public int getMilesValue() {
        return (int) Math.floor(this.cashValue * MilesConversionRate);
    }

    public double getCashValue() {
        return this.cashValue;
    }
}
