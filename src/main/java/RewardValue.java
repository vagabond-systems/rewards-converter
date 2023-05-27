public class RewardValue {
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = toCash(milesValue);
    }

    private static int toMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private static double toCash(int milesValue) {
        return (int) milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return toMiles(this.cashValue);
    }
}
