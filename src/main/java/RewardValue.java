package main.java;

public class RewardValue {
    double cashValue;
    double milesValue;

    double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        } else {
            this.cashValue = milesValue;
            this.milesValue = milesValue / MILES_TO_CASH_CONVERSION_RATE;
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
