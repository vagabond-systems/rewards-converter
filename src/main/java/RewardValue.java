public class RewardValue {

    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = (cashValue * 0.0035);
        this.milesValue = (cashValue / 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

}