public class RewardValue {

    double cashValue;
    double milesValue;

   //Constructor that accepts cash value
    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    //Constructor that accepts miles value
    public RewardValue(double milesValue,boolean isMiles)
    {
        this.milesValue=milesValue;
        this.cashValue=milesToCash(milesValue);
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public double getMilesValue()
    {
        return milesValue;
    }

    //convert cash to miles at rate of 0.0035
    private double cashToMiles(double cashValue)
    {
        return cashValue/0.0035;
    }

    //convert miles to cash at rate of 0.0035
    private double milesToCash(double milesValue)
    {
        return milesValue*0.0035;
    }


}
