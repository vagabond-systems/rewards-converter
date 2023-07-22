public class RewardValue {
    private double cashValue;
    private double milesValue;
    private double milesToCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / this.milesToCashRate;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * this.milesToCashRate;

    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.milesValue;
    }
}