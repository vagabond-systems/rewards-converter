public class RewardValue{

  private double cashValue;

  public RewardValue(double cashValue){
    this.cashValue = cashValue;
  }

  public double getMilesValue(){
    double milesToCashConversion = 0.0035;
    return milesToCashConversion * cashValue;
  }

  public double getCashValue(){
   return cashValue;
  }
}