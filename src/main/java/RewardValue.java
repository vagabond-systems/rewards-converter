public class RewardValue
{
    double cashValue, milesValue;

    public RewardValue(double n)
    {
        cashValue = n;
        milesValue = 0.0035 * n;
    }

    public double getCashValue()
    {   return cashValue;   }

    public double getMilesValue()
    {   return milesValue;  }
}
