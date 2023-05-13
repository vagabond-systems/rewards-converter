public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double miles_to_cash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / miles_to_cash);
    }

    public RewardValue(int milesValue) {
       this.milesValue = milesValue;
       this.cashValue = milesValue * miles_to_cash;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
