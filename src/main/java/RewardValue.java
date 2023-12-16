public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage: Use the other constructor for miles.");
        }
    }

    // Method to get the cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value of RewardValue
    public double getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash to miles
    private double convertCashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Helper method to convert miles to cash
    private double convertMilesToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
