public class RewardValue {
    double cashValue;
    double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }
    public RewardValue (int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }
}
