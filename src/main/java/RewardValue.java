public class RewardValue {
    double cashValue;
    int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;

        }
    public RewardValue (int miles) {
        this.miles = miles;
    }
    public int getMilesValue() {

        return miles;
    }
    public double getCashValue() {
        return cashValue;
    }
    public double rewardConversion () {
        double miles1;
        miles1 = cashValue / 0.0035;
        return miles1;
    }
}
