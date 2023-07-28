public class RewardValue {
    private double cash_value;
    private int miles_value;

    public RewardValue(double c) {
        this.cash_value = c;
        this.miles_value = (int) (c / 0.0035);
    }
    public RewardValue(int m) {
        this.miles_value = m;
        this.cash_value = m * 0.0035;
    }
    public double getCashValue() {
        return this.cash_value;
    }
    public int getMilesValue() {
        return this.miles_value;
    }
}
