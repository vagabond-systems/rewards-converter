public class RewardValue {
//Time to make your change - add a new class named RewardValue to the main.java package. Right-click on a directory in the project tab on the left, then highlight new to create a Java Class.
//This class must satisfy the following requirements:
//RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
//RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
//RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
//RewardValue must convert from miles to cash at a rate of 0.0035.
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

//    constructor that takes in cash
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

//    constructor that takes in miles
    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    private static double convertToMiles(double cashValue){
        return  (int)(cashValue/ MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return convertToMiles(this.cashValue);
    }

}


