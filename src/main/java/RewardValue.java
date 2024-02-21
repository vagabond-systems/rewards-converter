public class RewardValue
{
    double cashValue;
    double milesValue;
    RewardValue(double cash)
    {
        cashValue = cash;
    };
    RewardValue(int miles)
    {
        milesValue = miles;
    };
    double getMilesValue()
    {
        milesValue = cashValue/0.0035;
        return milesValue;
    }
    double getCashValue()
    {
        return cashValue;
    }
}
