public class RewardValue {
    private double cashValue;
    private static final double MILES_TO_CASH = 0.0035;

    // Constructor for initializing with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor for converting miles to cash value
    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Retrieve the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Retrieve the miles value
    public int getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }

    // Converts miles to cash
    private double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH;
    }

    // Converts cash to miles
    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH);
    }
}