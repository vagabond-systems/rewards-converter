public class RewardValue {

    double cashValue;
    int mileValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
    }

    public double getCashValue() {
        return mileValue * 0.0035;
    }

    public double getMilesValue() {
        return cashValue * 0.0035;
    }

}
