public class RewardValue {
    private double cashValue;
    public static final double milesToCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private double convertToCash(int miles) {
        return (miles * milesToCashRate);
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / milesToCashRate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}
