
public class RewardValue {

    //Conversion rate for miles to cash
    private final double MilesConversionRate = 0.0035;
    private double cashValue;

    public RewardValue(double cash){
        this.cashValue = cash;
    }
    public RewardValue(int miles){
        this.cashValue = miles * MilesConversionRate;
    }
    public double getCashValue(){
        return cashValue;
    }
    //Constructor with miles param took miles as an int, So it should be the best return type
    public int getMilesValue(){
        int dollarsToMiles = (int) (cashValue / MilesConversionRate);
        return dollarsToMiles;
    }
}
