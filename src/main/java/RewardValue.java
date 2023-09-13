public class RewardValue {
    private double MilesValue;
    private double CashValue;
    public RewardValue(double cashValue)
    {
        this.CashValue = cashValue;
        this.MilesValue = cashValue/0.0035;
    }

    public RewardValue(int milesValue)
    {
        this.MilesValue = milesValue;
        this.CashValue = milesValue*0.0035;
    }

    public double getCashValue()
    {
        return this.CashValue;
    }
    public double getMilesValue()
    {
        return this.MilesValue;
    }
}
