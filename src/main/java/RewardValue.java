public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cash) {
        cashValue = cash;
        milesValue = cash / 0.0035;
    }

    public RewardValue(int miles) {
        milesValue = miles;
        cashValue = miles * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
