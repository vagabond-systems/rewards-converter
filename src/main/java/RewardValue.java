public class RewardValue {

    private double cash;
    private int miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return miles * 0.0035;
    }

    public int getMilesValue() {
        return (int) (cash / 0.0035);
    }
}
