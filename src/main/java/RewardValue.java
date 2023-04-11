public class RewardValue {
    private double cashValue;
    private double milesValue;
    private final double MILES_TO_CASH = 0.0035;

    // accepts value in cash
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH;
    }

    // accepts value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) milesValue;
    }
}
