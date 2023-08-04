public class RewardValue {
    private final double cashValue;
    public static final double rate=0.0035;

    public RewardValue(double cashValue)
    {
        this.cashValue=cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue=milesToCash(milesValue);
    }

    private static double  cashToMiles(double cashValue){
        return (cashValue/rate);
    }

    private static double milesToCash(double milesValue)
    {
        return (milesValue*rate);
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public double getMilesValue()
    {
        return cashToMiles(this.cashValue);
    }
}