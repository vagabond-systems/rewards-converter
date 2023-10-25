public class RewardValue {

    private static final double CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / CONVERSION_RATE);
    }

}