public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        double milesValue = cashValue / 0.0035;
        return milesValue;
    }
}
