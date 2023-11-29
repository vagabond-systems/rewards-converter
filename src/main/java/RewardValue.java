public class RewardValue {
    public double cashValue;
    public double mileValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(double cashValue, double mileValue) {
        this.cashValue = cashValue;
        this.mileValue = mileValue;
    }
}
