public class RewardValue {
    private int mileValue;
    private double cashValue;
    final double MILE_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    //Java require overloaded constructor to have different types of sequences of parameters
    //So I'm assuming there are no partial miles(e.g. 0.5 miles)

    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
    }

    public double getCashValue() {
        //convert cash value to miles
        return this.cashValue;
    }

    public int getMilesValue() {
        //convert miles value to cash
        //At this stage of the project, I'm assuming that get MileValues is the only
        //method that do the conversion. In the future, I expected to have a method that
        //do the calculation and return the value separately.

        int rewardMileVal = (int) (this.cashValue * MILE_TO_CASH_CONVERSION_RATE);
        return rewardMileVal;
    }
}
