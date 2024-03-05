public class RewardValue {

    private double cashValue;
    private int milesValue;
    private static final double CONVERTION_RATE = 0.0035;

    // Constructor that accepts cash
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CONVERTION_RATE);
    }

    // Constructor that accepts miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERTION_RATE;
    }

    // Getter for Cash and miles
    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.milesValue;
    }
}