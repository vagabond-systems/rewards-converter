public class RewardValue {
    double cashValue;
    int milesValue;

    public RewardValue(int miles) {
        milesValue = miles;
        cashValue = miles * 0.0035;
    }

    public RewardValue(double cash) {
        cashValue = cash;
        milesValue = (int)(cash / 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
