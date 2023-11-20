package model;

public class RewardValue {
    private final double cashValue;
    // conversion rate from dollars to miles
    public static final double MILES_CONVERT = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * MILES_CONVERT;
    }


    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / MILES_CONVERT);
    }

}
