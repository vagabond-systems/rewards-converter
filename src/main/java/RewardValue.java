public class RewardValue {
    double cashValue;
    int milesValue;
    public RewardValue (double cash) {
        cashValue = cash;
    }
    public RewardValue (int miles) {
        milesValue = miles;
    }
    public double getCashValue() {
        return this.milesValue * 0.0035;
    }

    public int getMilesValue() {
        double result;
        result = RewardValue.this.cashValue / 0.0035;
        return (int) result;
    }
}