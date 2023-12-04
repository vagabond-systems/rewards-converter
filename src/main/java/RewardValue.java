public class RewardValue {

    private double cashValue;
    private int milesValue;
    private final double MULTIPLICATION_FACTOR = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(getCashValue() / MULTIPLICATION_FACTOR);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = (double)(getMilesValue() * MULTIPLICATION_FACTOR);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}
