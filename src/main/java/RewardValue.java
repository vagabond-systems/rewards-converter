public class RewardValue {
    private int miles;
    private double cash;
    private final double RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public int getMilesValue() {
        return this.miles;
    }

    public double getCashValue() {
        return this.cash;
    }
}
