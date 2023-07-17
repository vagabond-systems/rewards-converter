// RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
// RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
// RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
// RewardValue must convert from miles to cash at a rate of 0.0035.

public class RewardValue {
    private double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = miles * .0035;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.cash / 0.0035;
    }
}