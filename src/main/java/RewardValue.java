//package main.java;
public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    public RewardValue(double cashValue)
    {
        this.cashValue =cashValue;
        this.milesValue=(int) cashValue/0.0035;
    }
    public RewardValue(int milesValue)
    {
        this.milesValue=milesValue;
        this.cashValue=milesValue*0.0035;
    }
    public double getCashValue()
    {
        return cashValue;
    }
    public double getMilesValue()
    {
        return (int)milesValue;
    }
}
