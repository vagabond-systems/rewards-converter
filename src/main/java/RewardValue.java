public class RewardValue {
    private final double cashValue;
    private final int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int) (cashValue / .0035);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cashValue = miles * .0035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.miles;
    }
}
