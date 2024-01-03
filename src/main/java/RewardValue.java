public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Convert cash value to miles at the rate of 0.0035
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Convert miles value to cash at the rate of 0.0035
        this.cashValue = milesValue * 0.0035;
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public int getMilesValue() {
        return milesValue;
    }
}