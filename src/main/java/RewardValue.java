public class RewardValue {
    private double cash;
    private float miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles=(float)(cash*(0.0035));
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash=miles/(0.0035);
    }

    public double getCashValue() {
        return cash;
    }

    public float getMilesValue() {
        return miles;
    }
}
