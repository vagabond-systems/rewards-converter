public class RewardValue {

    private double cashVal;
    private int milesVal;

    public RewardValue(double cashVal) {
        this.cashVal = cashVal;
        this.milesVal = (int) (cashVal / 0.0035);
    }

    public RewardValue(int milesVal) {
        this.milesVal = milesVal;
        this.cashVal = milesVal * 0.0035;
    }

    public double getCashValue() {
        return cashVal;
    }

    public int getMilesValue() {
        return milesVal;
    }
}
