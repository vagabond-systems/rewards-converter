public class RewardValue {
    private final double CONVERSION_RATE = 0.0035;
    private final double cashValue;
    private final int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        milesValue = (int) (cashValue / CONVERSION_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        cashValue = milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
