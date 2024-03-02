public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor accepting a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor accepting a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to return the cash value of the RewardValue
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to return how many miles the RewardValue is worth
    public double getMilesValue() {
        return this.milesValue;
    }
}
