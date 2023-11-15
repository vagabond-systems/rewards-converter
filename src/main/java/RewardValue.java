public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) Math.round(cashValue / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public RewardValue(double cashValue, int milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }
}
