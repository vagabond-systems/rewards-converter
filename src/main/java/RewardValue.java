public class RewardValue {
    private double cashValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        // Convert miles to cash at a rate of 0.0035
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public int getMilesValue() {
        // Convert cash to miles at a rate of 1/0.0035
        return (int) (cashValue / 0.0035);
    }
}
