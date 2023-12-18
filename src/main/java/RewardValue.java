public class RewardValue {
    private final double cashValue;
    static final double MI_TO_CASH_CONVERT_RATE = 0.0035;

    public RewardValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / MI_TO_CASH_CONVERT_RATE);
    }

    private double convertToCash(int milesValue) {
        return (int) (milesValue * MI_TO_CASH_CONVERT_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}