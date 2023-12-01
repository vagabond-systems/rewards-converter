public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double cash) {
        this.miles =  (int) (cash / 0.0035);
        this.cash = cash;
    }
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = this.miles * 0.0035;
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }

}
