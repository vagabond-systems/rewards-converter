public class RewardValue {
    private final double cashValue;
    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }
    public double getCashValue() {
        return  this.cashValue;
    }
    public int getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }
    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
    private double convertMilesToCash(int miles) {
        return (miles * MILES_TO_CASH_CONVERSION_RATE);
    }
}
