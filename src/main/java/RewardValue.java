public class RewardValue {
    static final double conversion_rate = 0.0035;
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * conversion_rate;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / conversion_rate);
    }
}
