public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}