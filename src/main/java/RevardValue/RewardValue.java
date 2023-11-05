package RevardValue;

public class RewardValue {
    private double cashValue;
    private double conversionRate;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.conversionRate = 0.1;
    }

    public double getMilesValue() {
        return cashValue * conversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }
}
