/*
This class functions as a converter for miles and cash. I created two variables: cashValue and milesValue and made them
private to not allow the users of the RewardsConverter class to change the values. I also created two methods to provide
the users the ability to convert cash to miles and miles to cash.
 */
public class RewardValue {

    private double cashValue;
    private float milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (float) (cashValue / 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public float getMilesValue() {
        return (float)(milesValue * 0.0035);
    }
}
