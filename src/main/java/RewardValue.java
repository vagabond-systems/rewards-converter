public class RewardValue {
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue =milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / 0.0035);
    }
}
