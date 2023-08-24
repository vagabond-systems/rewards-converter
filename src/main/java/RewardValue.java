public class RewardValue {

    private double rewardValue;
    private int miles;

    private static final double CONVERSION_RATE = 0.0035;
    public RewardValue(double inputCashValue){
        rewardValue = inputCashValue;
    }

    public RewardValue(int inputMiles){
        miles = inputMiles;
    }

    public double getCashValue(){
        return rewardValue;
    }

    public double getMilesValue(){
        return rewardValue / CONVERSION_RATE;
    }
}
