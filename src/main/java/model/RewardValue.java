package model;

public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    private final double MILES_CONVERT = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue * MILES_CONVERT);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / MILES_CONVERT;
    }


    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

}
