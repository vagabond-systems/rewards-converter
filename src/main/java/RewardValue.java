

public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = milesValue * 0.0035;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return (int) (cashValue / 0.0035);
    }
}