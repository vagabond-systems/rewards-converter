public class RewardValue {

    private double cashValue;
    private int milesValue;
    private final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double milesToCashConverter(int milesValue) {
        double convertedMilesToCash = milesValue * CONVERSION_RATE;
        return convertedMilesToCash;
    }

}
