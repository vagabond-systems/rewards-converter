public class RewardValue {
    private double cashValue;
    private float milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(float milesValue) {
        this.milesValue = milesValue;
    }
    public double getCashValue() {
        cashValue = milesValue/0.0035;
        return cashValue;
    }
    public float getMilesValue() {
        milesValue = (float) (cashValue*0.0035);
        return milesValue;
    }
}
