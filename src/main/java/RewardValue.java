public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Method to convert from miles to cash at a rate of 0.0035
    public double milesToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    // Method to convert from cash to miles at a rate of 0.0035
    public double cashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }
}
