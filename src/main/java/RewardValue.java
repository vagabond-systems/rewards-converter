public class RewardValue {
    private double cashValue;
    private double milesValue;
    public RewardValue (double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue (int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
//        return (this.milesValue * 0.0035);
        return this.cashValue;
    }
    public double getMilesValue() {
//        return (this.cashValue / 0.0035);
        return this.milesValue;
    }
}
