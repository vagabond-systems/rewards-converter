public class RewardValue{

/*
 * RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
RewardValue must convert from miles to cash at a rate of 0.0035.
 * 
 * 
 */

 double cashValue;
 double milesValue;
 
 
 
public RewardValue(double cashValue)
{

        this.cashValue=cashValue;
        
}
 /* 
public RewardValue(double milesValue)
{

        this.milesValue=milesValue;
        
}
*/

public void setValue(double cashValue)
{
    this.cashValue=cashValue;
}

 public double getCashValue() 
 {
        return cashValue;
 }

 public double getMilesValue()
 {
        return milesValue = cashValue/0.0035;
 }
    
}
