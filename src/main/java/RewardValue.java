
public class RewardValue {
    private final double cashValue;
    public static final double ratio = 0.0035;


    // TWO CONSTRUCTORS (overloaded)
    //takes in cash value
    public RewardValue(double cashValue){//to avoid error need boolean
        this.cashValue = cashValue;
    }
    //takes in miles value
    public RewardValue(int milesValue){
        this.cashValue = toCash(milesValue);
    }
    
    //METHODS//

    private static double toCash(int milesValue){
        return  milesValue * ratio;
    }
    private static int toMiles(double cashValue){
        return (int) (cashValue / ratio);
    }

    //miles to cash
    public double getCashValue(){
        return cashValue;
    }
    //cash to miles
    public int getMilesValue(){ return toMiles(cashValue);}
}