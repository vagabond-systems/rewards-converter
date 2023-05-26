public class RewardValue {
    private double cash=0;
    private double mile=0;
    RewardValue(double cash)
    {
        this.cash=cash;
        this.mile=cash/0.0035;
    }
    RewardValue(int mile)
    {
        this.mile=mile;
        this.cash=mile*0.0035;
    }

    public double  getCashValue()
    {
        return this.cash;
    }
   public double  getMilesValue()
    {
        return this.mile;
    }
}
