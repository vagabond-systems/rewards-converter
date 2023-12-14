
public class RewardValue {
    
    private static double cashValue;
    public static final double conversionRate = 0.0035;

    public RewardValue( double cashValue){
       this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    public static double convertToCash(int milesValue){
        return cashValue = milesValue * conversionRate;
    }

    public static int convertToMiles (double cashValue){
        return (int) (cashValue / conversionRate);
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }

}