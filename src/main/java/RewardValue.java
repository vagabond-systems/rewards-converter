public class RewardValue {
    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private final double cashValue;
    private final int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double convertMilesToCash(double milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

}
