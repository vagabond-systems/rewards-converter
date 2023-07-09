public class RewardValue {
    public final double CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    double getCashValue() {
        if (cashValue != 0) {
            return cashValue;
        } else {
            return (double) (milesValue / CONVERSION_RATE);
        }
    }

    int getMilesValue() {
        if (milesValue != 0) {
            return milesValue;
        } else {
            return (int) (cashValue * CONVERSION_RATE);
        }
    }
}
