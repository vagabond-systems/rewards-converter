public class RewardValue {

    static final double CONVERSION_RATE = 0.0035;

    private final double cashValue;
    private final int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles();
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash();
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private int convertToMiles() {
        return (int) (cashValue / CONVERSION_RATE);
    }

    private double convertToCash() {
        return milesValue * CONVERSION_RATE;
    }
}
