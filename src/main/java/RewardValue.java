public class RewardValue {

    private final double cashValue;
    private static final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        cashValue = convertToCash(milesValue);
    }

    public static int convertToMiles(double cashValue) {
        return (int) (cashValue / CASH_TO_MILES_CONVERSION_RATE);
    }

    public static double convertToCash(int milesValue) {
        return milesValue * CASH_TO_MILES_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}
