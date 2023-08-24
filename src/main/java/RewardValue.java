public class RewardValue {

    private double rewardValue;
    private int miles;

    private static final double CONVERSION_RATE = 0.0035;
    public RewardValue(double inputCashValue){
        this.rewardValue = inputCashValue;
    }

    public RewardValue(int inputMiles){
        this.miles = inputMiles;
        this.rewardValue = inputMiles * CONVERSION_RATE;
    }

    public double getCashValue(){
        return this.rewardValue;
    }

    public double getMilesValue(){
        return this.rewardValue / CONVERSION_RATE;
    }
}
