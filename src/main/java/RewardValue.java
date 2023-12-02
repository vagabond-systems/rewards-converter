public class RewardValue {
    double cash;
    int miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public double getCashValue() {
        return miles * 0.0035;
    }

    public int getMilesValue() {
        return (int) (this.cash / 0.0035);
    }
}
