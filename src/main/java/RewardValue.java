public class RewardValue {
    // Attributes
    private double cashValue;
    private double milesValue;

    // Constructor
    public RewardValue() {
    };

    public RewardValue(double value) {
        this.cashValue = value;
    }

    //Methods Section
    double getMilesValue() {
        this.milesValue = this.cashValue / 0.0035;
        return Math.round(this.milesValue);
    }

    double getCashValue() {
        return this.cashValue;
    }
}
