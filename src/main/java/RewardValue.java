public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }
    private int convertToMiles(double cashValue) {
        return  (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
    private double convertToCash(double milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
}
