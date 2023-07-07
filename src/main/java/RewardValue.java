//import java.math.BigDecimal;

public class RewardValue {
  //  This is just an example there's a lot more information required to properly complete this.
  double conversionRate = 0.0035;
  double valueInCash;
    double valuePoints;
    int valueMiles;
    public RewardValue(double cash) {
        this.valuePoints = cash;
    }
    public RewardValue(int miles){
        this.valueMiles =  miles;
      System.out.println(miles);
    }
    public double getCashValue(){

      return valuePoints * 100;
    }
    public double getMilesValue(){

      return getCashValue()*conversionRate ;
    }
}
