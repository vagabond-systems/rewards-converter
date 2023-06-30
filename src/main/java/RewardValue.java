
public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    //RewardValue must convert from miles to cash at a rate of 0.0035.
    private static final double rate = 0.0035;

    //RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / rate);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * rate;
    }

    //RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    public double getCashValue() {
        return cashValue;
    }

    //RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    public int getMilesValue() {
        return milesValue;
    }

}
