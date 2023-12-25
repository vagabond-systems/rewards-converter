public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Convert cash to miles using the specified conversion rate
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            // Convert miles to cash using the specified conversion rate
            this.cashValue = milesValue * 0.0035;
        } else {
            this.cashValue = milesValue;
        }
    }

    // Getter method for cashValue
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for milesValue
    public double getMilesValue() {
        return milesValue;
    }
}