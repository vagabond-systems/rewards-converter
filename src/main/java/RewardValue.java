public class RewardValue {

    private final double cashValue;

    private final int milesValue;

    private final double CASH_AND_MILES_CONVERTER = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CASH_AND_MILES_CONVERTER); // Convert cash to miles
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CASH_AND_MILES_CONVERTER; // Convert miles to cash
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
