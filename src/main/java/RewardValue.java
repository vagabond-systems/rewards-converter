public class RewardValue {
    private double cashValue;
    private double milesValue;
    double milesCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public double getMilesValue(){
        return this.cashValue * milesCashRate;
    }
}
