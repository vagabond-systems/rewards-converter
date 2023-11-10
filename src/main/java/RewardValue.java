public class RewardValue {
    double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return mileValue;
    }

    int mileValue;

}
