public class RewardValue {

    // private double cashValue;
    // private double mileValue;

    // private static final double CONVERSION_RATE = 0.0035;
    // public RewardValue(double cashValue){
    // this.cashValue = cashValue;
    // }

    // public RewardValue(double mileValue){
    // this.mileValue = mileValue;

    // }

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