public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static double milesCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue(){
        if (this.milesValue != 0) { // if set via initialization
            return (int)this.milesValue;
        }
        else {
            return (int)(this.cashValue / milesCashRate);
        }
    }

    public int cashToMiles(double cash){
        return (int)(cash / milesCashRate);
    }

    public double milesToCash(double miles){
        return miles * milesCashRate;
    }
}
