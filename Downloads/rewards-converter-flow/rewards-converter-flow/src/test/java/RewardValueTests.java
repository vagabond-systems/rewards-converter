package main.java;

public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Convert miles to cash at a rate of 0.0035
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }

    // Convert cash to miles at a rate of approximately 285.7143
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }
}
