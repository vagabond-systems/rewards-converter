public class RewardValue {

    private double cashValue;
    private double milesValue;
    public static final double CONVERSION_RATE = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CONVERSION_RATE;
    }


    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
