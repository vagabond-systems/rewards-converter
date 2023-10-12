public class RewardValue {
    private double cashValue;
    private double milesValue;

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public RewardValue(double milesValue) { // must convert from miles to cash
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

}
