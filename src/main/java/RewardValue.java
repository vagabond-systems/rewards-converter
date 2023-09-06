public class RewardValue {
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        setCashValue(cashValue);
        calculateMilesValue(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void calculateMilesValue(double cashValue) {
        this.milesValue = (int) (cashValue * 0.0035);
    }

    public int getMilesValue() {
        return milesValue;
    }
}
