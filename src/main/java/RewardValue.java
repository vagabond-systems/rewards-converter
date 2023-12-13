public class RewardValue {

    private final double cashValue;
    public final static double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.cashValue = miles * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / MILES_TO_CASH_RATE);
    }

}
