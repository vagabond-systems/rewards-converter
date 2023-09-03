public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Calculate miles value based on the conversion rate
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            // Calculate cash value based on the conversion rate
            this.cashValue = milesValue * 0.0035;
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}

