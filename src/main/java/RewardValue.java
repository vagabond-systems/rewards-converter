public class RewardValue {
    private final  double cashValue;

    public RewardValue(double cashValue){
    this.cashValue=cashValue;
    }

    public RewardValue(int miles){
    this.cashValue=convertToCash(miles);
    }

    public  double getCashValue(){
        //this function returns the cash value of the RewardValue
        return cashValue;
    }

    public int getMilesValue(){
        //returns how many miles the RewardValue is worth
        return convertToMiles(cashValue);
    }

    public double convertToCash(int miles){
        return (int)(miles * 0.0035);
    }
    public static int convertToMiles(double cashValue){
        return (int) (cashValue / 0.0035);
    }

}
