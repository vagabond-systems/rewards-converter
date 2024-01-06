public class RewardValue {
    double cashValue;
    int milesValue;
    public RewardValue (double cash) {
        this.cashValue = cash;
    }
    public RewardValue (int miles) {
        this.milesValue = miles;
    }
    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / 0.0035);
    }
}