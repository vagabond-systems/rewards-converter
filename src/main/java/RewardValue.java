public class RewardValue {              //two constructors
    private double cashValue;           //Accepts a cash value
    private double milesValue;          //Accepts a value in miles

    public RewardValue(double value) {
        this.cashValue = value;
        this.milesValue = value * 0.0035;          //Convert from miles to cash
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
