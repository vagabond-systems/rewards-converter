public class RewardValue {

    private double cashValue;
    private double milesValue;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(double milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
