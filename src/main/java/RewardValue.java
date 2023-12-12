public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
//        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    private double cashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    private double milesToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    public int getMilesValue() {
        return (int) (cashValue / 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }
}
