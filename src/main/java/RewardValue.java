public class RewardValue {

    double cashValue;
    int rewardsValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int rewardsValue) {
        this.rewardsValue = rewardsValue;
    }

    public double getCashValue(){
        return rewardsValue / 0.0035;
    }

    public double getMilesValue(){
        return cashValue * 0.0035;
    }

}
