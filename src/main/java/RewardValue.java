public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double value, boolean isCash) {
        if (isCash) {
            this.cashValue = value;
            this.milesValue = value / 0.0035;
        } else {
            this.milesValue = value;
            this.cashValue = value * 0.0035;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
