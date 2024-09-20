/*
 * RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
 * RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
 * RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
 * RewardValue must convert from miles to cash at a rate of 0.0035.
 */

 public class RewardValue{
    //variables
    private double cash;
    private int miles;
    private static final double RATE = 0.00355000;

    //constructors
    public RewardValue (double aCash){
        this.cash = aCash;
        this.miles = (int) (aCash / RATE);
    }
    public RewardValue (int aMiles){
        this.miles = aMiles;
        this.cash = aMiles * RATE;
    }

    //functions
    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return miles;
    }

 }