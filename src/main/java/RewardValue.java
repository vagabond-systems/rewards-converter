//import java.math.BigDecimal;

public class RewardValue {
  //  This is just an example there's a lot more information required to properly complete this.
    double valueInCash;
    double valuePoints;
    double valueMiles;
    public RewardValue(double cash) {
        this.valuePoints = cash * 10;
    }
    public RewardValue(int miles){
        this.valueMiles =  miles * 2;
    }
    public double getCashValue(){
    return valuePoints;
    }
    public double getMilesValue(){
        return 0.00;
    }
}
