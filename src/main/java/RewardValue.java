public class RewardValue {
    private double cashValue;
    public static final double milesToCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(cashValue);
    }

    private double convertToCash(double miles) {
        return (miles / milesToCashRate);
    }

    private int convertToMiles(double miles) {
        return (int) (miles * milesToCashRate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}
