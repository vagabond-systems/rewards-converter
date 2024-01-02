public class RewardValue {
    double cash;
    static double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        cash = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cash = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return (milesValue * MILES_TO_CASH_CONVERSION_RATE);
    }

    public int getMilesValue() {
        return convertToMiles(this.cash);
    }

    public double getCashValue() {
        return cash;
    }
}