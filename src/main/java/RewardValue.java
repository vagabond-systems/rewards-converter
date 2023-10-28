public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double value, boolean isMiles) {
        if (isMiles) {
            this.milesValue = value;
            this.cashValue = value * 0.0035; // Conversion from miles to cash
        } else {
            this.cashValue = value;
            this.milesValue = value / 0.0035; // Conversion from cash to miles
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
