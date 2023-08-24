public class RewardValue {

    private double rewardValue;
    private int miles;
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
        return rewardValue * 0.0035;
    }
}
