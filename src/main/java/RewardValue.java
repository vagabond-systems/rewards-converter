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
        if (milesValue > 0) {
            return (this.milesValue * 0.0035);
        } else {
            return this.cashValue;
        }
    }
    public double getMilesValue() {
        if (cashValue > 0) {
            return (this.cashValue / 0.0035);
        } else {
            return this.milesValue;
        }

    }
}
