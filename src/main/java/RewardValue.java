public class RewardValue
{
    double cashValue;
    int milesValue;

    public RewardValue(double n)
    {   cashValue = n;
        milesValue = (int) (0.0035 * cashValue);
    }

    public RewardValue(int n)
    {   milesValue = n;
        cashValue = milesValue / 0.0035;
    }

    public double getCashValue()
    {   return cashValue;   }

    public int getMilesValue()
    {   return milesValue;  }
}
