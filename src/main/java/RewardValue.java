public class RewardValue {
    private double cashValue;
    private double conversionRate;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.conversionRate = 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashValue * conversionRate;
    }
}
