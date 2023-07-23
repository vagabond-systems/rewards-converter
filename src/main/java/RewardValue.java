public class RewardValue {
    double cash;
    long miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(long miles) {
        this.cash = miles*0.0035;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.cash*1.0 / 0.0035;
    }
}
