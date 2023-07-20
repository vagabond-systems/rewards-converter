public class RewardValue {
    public double cashValue;
    public int milesValue;
    private final double CONVERSION_RATE = 0.0035;
    public RewardValue (double cashInput)
    {
        cashValue=cashInput;
        milesValue= cashToMiles(cashInput);
    }
    public RewardValue (int milesInput)
    {
        milesValue=milesInput;
        cashValue= milesToCash(milesInput);
    }
    public int getMilesValue()
    {
        return milesValue;
    }
    public double getCashValue(){
        return cashValue;
    }
    public int cashToMiles(double cash)
    {
        return (int)(cash / CONVERSION_RATE);
    }
    public double milesToCash(int miles)
    {
        return (double) (miles*CONVERSION_RATE);
    }
}
