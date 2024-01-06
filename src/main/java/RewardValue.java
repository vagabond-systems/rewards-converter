package main.java;

public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash or miles value
    public RewardValue(double value, boolean isCash) {
        if (isCash) {
            this.cashValue = value;
            this.milesValue = convertToMiles(value);
        } else {
            this.milesValue = value;
            this.cashValue = convertToCash(value);
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

    // Helper method to convert miles to cash
    private double convertToCash(double miles) {
        return miles * 0.0035;
    }

    // Helper method to convert cash to miles
    private double convertToMiles(double cash) {
        return cash / 0.0035;
    }
}
