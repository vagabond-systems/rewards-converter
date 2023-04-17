public class RewardValue {
    double cashValue;
   int milesValue;
    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue)
    {
        this.milesValue= milesValue;
    }

    public int getMilesValue() {
        return (int) (this.cashValue / 0.0035);
    }

    public double getCashValue() {
        return cashValue;
    }


}
