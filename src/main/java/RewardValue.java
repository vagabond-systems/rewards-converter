public class RewardValue {
    public int miles;
    public double cash;

    private double MULTIPLIER = 0.0035;

    public RewardValue(int mileVal) {
        this.miles = mileVal;
    }

    public RewardValue(double cashVal) {
        this.cash = cashVal;
    }

    public  int getMilesValue() {
        return (int)(this.cash / MULTIPLIER);
    }

    public double getCashValue() {
        return (double) (this.miles * MULTIPLIER);
    }
}
