public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public static double getMilesToCashRate() {
        return MILES_TO_CASH_RATE;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
