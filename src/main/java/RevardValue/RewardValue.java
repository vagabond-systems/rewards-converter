package RevardValue;

public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return cashValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }
}
