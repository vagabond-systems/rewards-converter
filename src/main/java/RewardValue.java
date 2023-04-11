public class RewardValue {
    private double cash;
    private int miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash * .00035);

    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = (double) (miles / .00035);
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }
}
