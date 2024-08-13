public class RewardValue {
    private double CashValue;
    private double MilesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double CashValue) {
        this.CashValue = CashValue;
        this.MilesValue = CashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor that accepts a miles value
    public RewardValue(int MilesValue) {
        this.MilesValue = MilesValue;
        this.CashValue = MilesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return CashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return MilesValue;
    }
}
