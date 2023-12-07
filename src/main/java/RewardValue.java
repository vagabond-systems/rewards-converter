public class RewardValue {
//    RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//    RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//    RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//    RewardValue must convert from miles to cash at a rate of 0.0035.

    private double cashValue;
    private double milesValue;



    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035; // Conversion rate from miles to cash
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with cash value.");
        }
    }

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Conversion rate from cash to miles
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }
}



