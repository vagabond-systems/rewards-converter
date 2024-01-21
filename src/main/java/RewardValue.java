public class RewardValue {
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // The below line will result in a loss in precision.
        // However, the task does not have a clear requirement and hence assuming a loss in precision is acceptable
        // Requirements as stated in the task : RewardValue must convert from miles to cash at a rate of 0.0035.
        this.milesValue = (int) (cashValue / 0.0035);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }
    public int getMilesValue() {
        return  this.milesValue;
    }
    public double getCashValue() {
        return this.cashValue;
    }
}
