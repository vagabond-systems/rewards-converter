//import RewardsConverter;

public class RewardsValue {
    //RewardValue cashValue = new RewardValue(double);
  //  RewardValue milesValue = new RewardValue(double);
    private double cashValue;
    private double milesValue;
    public RewardsValue(double cash) {
         this.cashValue = cash;
         this.milesValue = cash /0.0035;
         
    }
    public RewardsValue(int miles) {
        this.milesValue = miles;
        this.cashValue = milesValue * 0.0035;
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return this.milesValue;
    }

    
    
}

