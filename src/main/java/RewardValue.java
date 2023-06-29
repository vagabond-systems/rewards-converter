public class RewardValue {
    private double milesValue, cashValue;
    public RewardValue(double cash)
    {
        milesValue = cash / .0035;
    }
    public RewardValue(float miles)
    {
        cashValue = miles * .0035;
    }
    public double getCashValue()
    {
        return cashValue;
    }
    public double getMilesValue()
    {
        return milesValue;
    }
}
