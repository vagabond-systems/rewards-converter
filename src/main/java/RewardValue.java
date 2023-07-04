public class RewardValue {

    private double cashValue;
    private double milesValue;



    private static final double MilesToCashRate = 0.0035;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MilesToCashRate;
    }

    public RewardValue(int milesValue)
    {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MilesToCashRate;
    }

    public double getCashValue()
    {
        return this.cashValue;
    }

    public double getMilesValue()
    {
        return this.milesValue;
    }
}
