

public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035); // Convert cash to miles
    }

    // // Constructor accepting miles value
    // public RewardValue(int milesValue) {
    //     this.milesValue = milesValue;
    //     this.cashValue = milesValue * 0.0035; // Convert miles to cash
    // }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }
}
