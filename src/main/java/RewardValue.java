package main.java; 

public class RewardValue {
    private double cashValue;
    private int  mileValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.mileValue = (int)(cashValue / 0.0035); // Convert cash to miles
    }

    // Constructor for mile value
    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
        this.cashValue = mileValue * 0.0035; // Convert miles to cash
    }

    // Method to get cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return this.mileValue;
    }
}
