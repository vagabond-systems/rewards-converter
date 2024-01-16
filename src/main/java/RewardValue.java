// main/RewardValue.java
import java.util.Scanner;
public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Method to get the cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value of RewardValue
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
