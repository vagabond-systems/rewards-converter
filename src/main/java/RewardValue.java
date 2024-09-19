public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Conversion rate from miles to cash
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) milesValue; // Casting to int to ensure miles are whole numbers
    }
}