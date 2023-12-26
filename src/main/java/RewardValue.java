public class RewardValue {
    double cash;
    int miles;
    public RewardValue(double cashValue, int milesValue) {
        cash = cashValue;
        miles = milesValue;
    }

    public int getMilesValue() {
        miles = (int) (cash / 0.0035);
        return miles;
    }

    public double getCashValue() {
        cash = miles * 0.0035;
        return cash;
    }
}