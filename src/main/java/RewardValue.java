public class RewardValue {


//    If 1 mile is equal to 0.0035 reward cash value
    private double cashValue;
    private double milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getMilesValue() {
        return milesValue;
    }
    public double getCashValue() {
        return cashValue;
    }
}
