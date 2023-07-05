import java.util.Scanner;

// RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
// RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
// RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
// RewardValue must convert from miles to cash at a rate of 0.0035.

public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // public static double getMilesToCashRate() {
    // return MILES_TO_CASH_RATE;
    // } // Added a getter method for the MILES_TO_CASH_RATE field in the RewardValue class to getting access to MILES_TO_CASH_RATE in test

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

}

