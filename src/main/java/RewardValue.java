
public class RewardValue {
    private double cashValue;
    private int milesValue;

    // TWO CONSTRUCTORS (overloaded)
    //takes in cash value
    public RewardValue(double cashValue){//to avoid error need boolean
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }
    //takes in miles value
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = cashValue;
    }
    
    //METHODS

    //miles to cash
    public double getCashValue(){
        return (milesValue * 0.0035);
    }
    //cash to miles
    public int getMilesValue(){
        return (int)(cashValue / 0.0035); 
    }
}