public class RewardValue {

    private double cash;
    private int miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (this.getCashValue() / 0.0035);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = this.getMilesValue() * 0.0035;

    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }

}