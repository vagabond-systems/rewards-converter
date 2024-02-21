public class RewardValue
{
    double cashValue;

    RewardValue(double cash)
    {
        cashValue = cash;
    }

    RewardValue(int miles)
    {
        cashValue = milesToCash(miles);
    }

    int cashToMiles(double cashValue)
    {
        return (int) (cashValue / 0.0035);
    }

    double milesToCash(int milesValue)
    {
        return (milesValue * 0.0035);
    }

    double getMilesValue()
    {
        return cashToMiles(cashValue);
    }

    double getCashValue()
    {
        return cashValue;
    }
}