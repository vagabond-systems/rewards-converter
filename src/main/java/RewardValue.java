public class RewardValue {
    double cashValue;
    String mileValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public double getCashValue() {
        return cashValue;
    }
    public String getMilesValue() {
        mileValue=String.format("%.2f",cashValue*0.0035);
        return mileValue;
    }
}

