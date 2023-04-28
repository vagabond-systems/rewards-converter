public class RewardValue {
    private double cashValue;
    private int milesValue;

    // define constructors
    // accept cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // accept miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // define methods
    // getCashValue() returns cash value of the reward value
    public double getCashValue() {
        return cashValue;

    }

    // getMilesValue() returns miles value of the reward value
    public int getMilesValue() {
        return milesValue;
    }
}
