public class RewardValue {
   private double cashValue ;
    private double milesValue;
    double MilesToCashConverter = 0.0035;
 
    public RewardValue(double cashValue) {
       this.cashValue = cashValue;
       this.milesValue = cashValue / this.MilesToCashConverter;
    }
 
    public RewardValue(double milesValue, boolean isMiles) {
       if (isMiles) {
          this.milesValue = milesValue;
          this.cashValue = milesValue * this.MilesToCashConverter;
       }
 
    }
 
    public double getCashValue() {
       return this.cashValue;
    }
 
    public double getMilesValue() {
       return this.milesValue;
    }
}
    

    public static void main(String[] args) {
        RewardValue reward = new RewardValue(20000, true);
        
      System.out.println("Cash Value: $" + reward.getCashValue());
        System.out.println("Miles Value: " + reward.getMilesValue() + " miles"); 
    }
