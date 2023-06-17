public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Converting cash value to miles
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMilesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles value to cash
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }
}

