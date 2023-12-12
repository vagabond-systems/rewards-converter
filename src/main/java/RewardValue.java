public class RewardValue {
    private double cashValue;
    private int mileValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.mileValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return mileValue;
    }
    public double convertMilesToCash(double cash){
        return cash * 0.0035;
    }
    public double convertCashToMiles(double miles){
        return miles / 0.0035;
    }
}
