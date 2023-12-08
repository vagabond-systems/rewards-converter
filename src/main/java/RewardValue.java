public class RewardValue {
    private final double cashValue;
    private static final double CONVERT_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles) {
        this.cashValue = miles * CONVERT_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return (int) cashValue / CONVERT_RATE;
    }
}
