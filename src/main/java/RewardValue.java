
public class RewardValue {

    //Conversion rate for miles to cash
    private final double MilesConversionRate = 0.0035;
    private double cashValue;

    public RewardValue(double cash){
        this.cashValue = cash;
    }
    public RewardValue(int miles){
        this.cashValue = convertToCash(miles);
    }
    public int convertToMiles (double cash){
        int mileValue = (int) (cash / MilesConversionRate);
        return mileValue;
    }
    public double convertToCash (int miles){
        double cashValue = miles * MilesConversionRate;
        return cashValue;
    }
    public double getCashValue(){
        return cashValue;
    }
    //Constructor with miles param took miles as an int, So it should be the best return type
    public int getMilesValue(){
        int dollarsToMiles = convertToMiles(cashValue);
        return dollarsToMiles;
    }
}
