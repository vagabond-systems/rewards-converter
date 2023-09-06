public class RewardValue {
    public double toCash = 0.0035;
    private final double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        calculateMilesValue(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = calculateCashValue(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    private void calculateMilesValue(double cashValue) {
        this.milesValue = (int) (cashValue / toCash);
    }

    private double calculateCashValue(int milesValue) {
        return milesValue * toCash;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
