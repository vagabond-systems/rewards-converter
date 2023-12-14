public class RewardValue {
//Time to make your change - add a new class named RewardValue to the main.java package. Right-click on a directory in the project tab on the left, then highlight new to create a Java Class.
//This class must satisfy the following requirements:
//RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//RewardValue must convert from miles to cash at a rate of 0.0035.
    private double cashValue;
    private double milesValue;

//    constructor that takes in cash
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

//    constructor that takes in miles
    public RewardValue(double milesValue, boolean isMiles){
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    //    private method for cash to miles conversion
    private double cashToMiles(double cashValue){
        return cashValue/ 0.0035;
    }

    //    private method for miles to cash conversion
    private double milesToCash(double milesValue){
        return milesValue * 0.0035;
    }
}


