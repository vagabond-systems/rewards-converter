public class RewardValue {
    final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;
    private double cash;
    private int miles;

    // ****************
    // Constructors
    // ****************
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles) {
        this.miles = miles;
    }

    // *************
    // Methods
    // *************
    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return (int)(this.cash / CASH_TO_MILES_CONVERSION_RATE);
    }
}
