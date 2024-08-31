public class RewardValue
{
    double cashValue;
    RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue)
    {
        this.cashValue = milesValue * 0.0035;
    }

    double getCashValue()
    {
        return cashValue;
    }

    int getMilesValue()
    {
        return (int)(cashValue / 0.0035);
    }
}
