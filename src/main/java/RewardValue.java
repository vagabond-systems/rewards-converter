public class RewardValue {
    private Double cashValue;
    private double mileValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.mileValue = cashValue / 0.0035;
    }

    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
        this.cashValue = mileValue * 0.0035;
    }
    public Double getMilesValue() {
        return mileValue;
    }
    public Double getCashValue() {
        return cashValue;
    }

}