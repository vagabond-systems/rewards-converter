public class RewardValue {
    private Double cashValue;
    private double mileValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
         
    }
    public Double getMilesValue() {
        return cashValue / 0.0035;
    }
    public Double getCashValue() {
        return mileValue * 0.0035;
    }

}