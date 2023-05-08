public class RewardValue {

    private double cash;
    private float miles;


    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(float miles) {
        this.miles = miles;
    }

    public double getCashValue(){
        // returns the cash value of RewardsValue
        return miles / 0.0035;
    }

    public double getMilesValue(){
        // returns the miles value of RewardsValue
        return cash * 0.0035;
    }
}
