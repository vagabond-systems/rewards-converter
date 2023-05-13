public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double convertingValue = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / convertingValue);
    }

    public RewardValue(int milesValue) {
       this.milesValue = milesValue;
       this.cashValue = milesValue * convertingValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
