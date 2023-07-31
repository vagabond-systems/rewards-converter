public class RewardValue {
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.cashValue = miles/0.0035D;
    }

    public int getMilesValue() {
        return (int) Math.floor(this.cashValue * 0.0035D);
    }

    public double getCashValue() {
        return this.cashValue;
    }
}
