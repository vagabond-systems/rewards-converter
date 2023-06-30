import java.math.BigDecimal;

public class RewardValue {

    //Conversion rate for miles to cash
    private final double CONVERSIONRATE = 0.0035;
    private double cashValue;

    public RewardValue(double cash){
        this.cashValue = cash;
    }
    public RewardValue(int miles){
        this.cashValue = miles * CONVERSIONRATE;
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        double dollarsToMiles = cashValue / CONVERSIONRATE;
        return dollarsToMiles;
    }
}
