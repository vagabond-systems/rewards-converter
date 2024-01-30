package main.java;

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
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion from cash to miles at a rate of 0.0035
    private double convertToMiles(double cashValue) {
        return cashValue * 0.0035;
    }

    // Conversion from miles to cash at a rate of 0.0035
    private double convertToCash(double milesValue) {
        return milesValue / 0.0035;
    }
}
