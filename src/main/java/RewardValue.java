public class RewardValue {
    double cashValue;
    
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int mileValue) {
        this.cashValue = mileValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return (int) (cashValue / 0.0035);
    }
}
