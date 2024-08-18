public class RewardValue {
    private double cashValue;
   private double milesValue;

   public RewardValue(double cash){
       this.cashValue=cash;
       this.milesValue=cash/0.0035;
   }
   public RewardValue (int miles){
       this.milesValue=miles;
       this.cashValue=miles*0.0035;
   }

   public double getCashValue(){
       return cashValue ;
   }
   public double getMilesValue(){
       return milesValue;
   }


}
