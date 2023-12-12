public class RewardValue {
    private final double cashValues;
    private final int milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValues) {
        this.cashValues = cashValues;
        this.milesValue = (int) (cashValues / MILES_TO_CASH_CONVERSION_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValues = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return this.cashValues;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}
