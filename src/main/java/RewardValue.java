public class RewardValue {

    private double cashValue;
    private double milesValue;

    // accepting cash Value as a parameter
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
