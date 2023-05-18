public class RewardValue {
    private double cashValue;
    private float milesValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(float milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public float getMilesValue() {
        return milesValue = (float) (0.0035 * cashValue);
    }
}
