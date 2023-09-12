public class RewardValue {
    private final double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return cash/0.0035;
    }
}
