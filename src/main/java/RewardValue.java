public class RewardValue {
    private final double cashValue;
    private double milesValue;

    // Conversion rate from miles to cash
    public static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor accepting a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / MILES_TO_CASH_RATE);
    }

    // Constructor accepting a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = (double) (milesValue * MILES_TO_CASH_RATE);
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
