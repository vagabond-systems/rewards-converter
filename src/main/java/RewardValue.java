public class RewardValue {

    public double cash;

    private final double MULTIPLIER = 0.0035;

    public RewardValue(int mileVal) {
        this.cash = (double) (mileVal * MULTIPLIER);
    }

    public RewardValue(double cashVal) {
        this.cash = cashVal;
    }

    public  int getMilesValue() {
        return (int)(this.cash / MULTIPLIER);
    }

    public double getCashValue() {
        return this.cash;
    }
}
