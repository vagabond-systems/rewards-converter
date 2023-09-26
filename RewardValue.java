public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = 0;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.cashValue = milesValue * 0.0035; // Convert miles to cash
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}