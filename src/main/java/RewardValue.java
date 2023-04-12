public class RewardValue {
    private double cashValue;
    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles) {
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / 0.0035);
    }
}
