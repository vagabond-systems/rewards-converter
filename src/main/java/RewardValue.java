public class RewardValue {
    private double cashValue = 0;
    private double miles = 0;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        miles = cashValue / 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return miles;
    }
}