public class RewardValue {
    // Attributes
    private double cashValue;
    private double milesValue;

    // Constructor
    public RewardValue(double value) {
        this.cashValue = value;
    }

    //Methods
    double getCashValue() {
        return this.cashValue;
    }

    double getMilesValue() {
        this.milesValue = this.cashValue * 0.0035;
        return this.milesValue;
    }
}
