public class RewardValue {
    // fields to store cash and miles values
    private double cashValue;
    private int milesValue;

    // constant conversion rate from miles to cash
    private static final double CONSTANT_RATE = 0.0035;

    // constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    // retrieve the cash value
    public double getCashValue() {
        // calculate cash value from miles using the constant rate
        return this.milesValue / CONSTANT_RATE;
    }

    // retrieve the miles value
    public int getMilesValue() {
        // calculate miles value from cash using the constant rate
        return (int) (this.cashValue / CONSTANT_RATE);
    }
}