public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = toMiles(cashValue);
    }


    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = toCash(milesValue);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

    private int toMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private double toCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
