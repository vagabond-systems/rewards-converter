public class RewardValue {
    double cashValue;
    double mileValue;
    
    public RewardValue(double cashValue) {
        this(cashValue, cashValue / 0.0035);
    }
    public RewardValue(double cashValue, double mileValue) {
        this.cashValue = cashValue;
        this.mileValue = mileValue;
    }

    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return mileValue;
    }
}
