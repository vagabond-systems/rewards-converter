public class RewardValue {
    private double cashValue;
    private double milesValue;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue/0.0035;
    }
    public RewardValue(double milesValue, boolean isMiles){
        if(isMiles){
            this.milesValue = milesValue;
            this.cashValue = milesValue*0.0035;
        }
    }
    //get cash value of rewardValue
    public double getMilesValue(){
        return milesValue;
    }
    public double getCashValue(){
        return cashValue;
    }
}
