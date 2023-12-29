public class RewardValue {
    // fields to store cash and miles values
    private double cashValue;
    private int milesValue;

    // constant conversion rate from miles to cash
    private static final double CONSTANT_RATE = 0.0035;

    // constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CONSTANT_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONSTANT_RATE;
    }

    // retrieve the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // retrieve the miles value
    public int getMilesValue() {
        return this.milesValue;
    }
}
