public class RewardValue {
    //RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    //RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    //RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    //RewardValue must convert from miles to cash at a rate of 0.0035.
    private double cashValue;
    private int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public int getMilesValue() {
        return milesValue;
    }

}

