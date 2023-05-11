public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double convertRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / convertRate);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;

        this.cashValue =  milesValue * convertRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
