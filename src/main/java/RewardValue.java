public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with cash value.");
        }
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Helper method to convert miles to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
