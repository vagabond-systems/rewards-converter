public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    private double cashValue;

    // Constructor for Cash Value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    // Constructor for Miles Value
    public RewardValue(int milesValue) {
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
    // Getter for Cash Value
    public double getCashValue() {
        return cashValue;
    }
    // Getter for Miles Value
    public int getMilesValue() {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
}