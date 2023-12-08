public class RewardValue {
    private double cashValue;
    private double milesValue;
    private double convertRate = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cash / convertRate;
    }

    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = milesValue / convertRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
