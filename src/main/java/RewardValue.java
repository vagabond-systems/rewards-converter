public class RewardValue {
    private double milesValue;

    public RewardValue(double milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        double cashValue = milesValue * 0.0035;
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
