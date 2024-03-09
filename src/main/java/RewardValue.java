public class RewardValue {
    double cash;
    double miles;
    public RewardValue(double cashValue) {
        cash = cashValue;
    }
    public RewardValue(int milesValue) {
        miles = milesValue;

    }
    public double getCashValue() {

        return cash;
    }
    public double getMilesValue() {
        return cash * .0035;

    }
}
