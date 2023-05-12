public class RewardValue {
  private double cashValue;
  public static final double CONVERSION_RATE = 0.0035;

  public RewardValue(double cashValue){
    this.cashValue = cashValue;
  }
  public RewardValue(int milesValue){
    this.cashValue = milesValue * CONVERSION_RATE;
  }

  public double getCashValue(){
   return cashValue; 
  }

  public int getMilesValue(){
    return (int) (cashValue / CONVERSION_RATE);
   }
}
