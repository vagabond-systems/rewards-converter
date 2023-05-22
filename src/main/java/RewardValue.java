public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }
    public int getMilesValue() {
        return (int) (cashValue / MILES_TO_CASH_RATE);
    }

    public double getCashValue(){
        return cashValue;
    }
}
