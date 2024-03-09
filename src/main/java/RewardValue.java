public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Helper method to convert miles to cash
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }
}
