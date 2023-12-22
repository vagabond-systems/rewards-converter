//mycode
public class RewardValue {
public double cashVal ;
    public double milesVal;
//constructors
    public RewardValue(double cashVal)
    {
        this.cashVal=cashVal;
        this.milesVal=convertCashToMiles(cashVal);
    }
    public RewardValue(double milesVal)
    {
        this.milesVal=milesValue;
        this.cashVal=convertMilesToCash(milesVal);
    }

    //get the cash value
    public double getCashValue() 
    {
        return cashVal;
    }

    //get the miles value
    public double getMilesValue()
    {
        return milesVal;
    }
//cash to mile method
     private double convertCashToMiles(double cashVal)
    
    {
        return cashVal / 0.0035;
    }

    //mile to cash method
    private double convertMilesToCash(double milesVal)
    {
        return milesVal * 0.0035;
    }

}
