
public class RewardValue {
    double cash;
    float miles;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue(float milesValue) {
        this.miles = milesValue;
    }

    public double getCashValue() {
        float milesValue = this.miles;
        return (double) milesValue/0.0035;
    }

    public float getMilesValue() {
        double cashValue = this.cash;
        return (float) (cashValue*0.0035);
    }
}