public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        milesValue = cashValue / 0.0035;
    }

    public RewardValue(int miles) {
        this.milesValue = miles;
        cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
}
