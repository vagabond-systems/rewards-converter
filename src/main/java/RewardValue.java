public class RewardValue {
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    static double convertToCash(int milesValue) {
        return (milesValue * 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
