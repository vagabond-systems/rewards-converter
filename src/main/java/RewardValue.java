public class RewardValue {
    private double cashValue;
    private int milesValue;

   // Constructor to take in cashValue
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
        // Constructor to take in cashValue
    }

    // Constructor to take in milesValue
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Convert miles value to cash
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
