public class RewardValue {
    double cash;
    int miles;
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = getMilesValue();
    }
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = getCashValue();
    }
    public double getCashValue() {
        return miles * 0.0035;
    }
    public int getMilesValue() {
        return (int) (cash / 0.0035);
    }
}