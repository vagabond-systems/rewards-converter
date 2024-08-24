public class RewardValue {
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) Math.round(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
}