public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035; // Convert to miles at the rate of 0.0035
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue / 0.0035; // Convert to cash
        } else {
            // Handle the case where the flag is not true
            this.milesValue = 0; // Set a default value or handle the scenario as needed
            this.cashValue = 0; // Set a default value or handle the scenario as needed
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
