public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor for cash value (double)
    public RewardValue(double cashValue) {  // Accepts double for cash
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);  // Converts cash to miles
    }

    // Constructor for miles value (int)
    public RewardValue(int milesValue) {  // Accepts int for miles
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;  // Converts miles to cash
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }
}