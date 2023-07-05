public class RewardValue {

    private final double cashValue;
    private final int milesValue;
    private final double DOLLARS_PER_MILE_EXCHANGE_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / DOLLARS_PER_MILE_EXCHANGE_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * DOLLARS_PER_MILE_EXCHANGE_RATE;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}
