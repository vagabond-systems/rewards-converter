public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor with cash value as input
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor with miles as input
    public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
    }
    // Get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles equivalent to the cashValue
    public int getMilesValue() {
        return milesValue;
    }
}
