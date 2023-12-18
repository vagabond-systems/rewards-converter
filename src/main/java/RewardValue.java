public class RewardValue {
    final double CONVERSION_RATE = 0.0035;
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
    // - Converts miles to cash.
    public double getCashValue() {
        return this.miles * CONVERSION_RATE;
    }

    // - Converts cash to miles.
    public int getMilesValue() {
        return (int)(this.cash / CONVERSION_RATE);
    }
}
