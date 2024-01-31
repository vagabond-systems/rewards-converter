public class RewardValue
{
    Double milesValue;
    double cashValue;
    RewardValue(double cashValue)
    {
        this.cashValue=cashValue;
    }

    RewardValue(Double milesValue)
    {
        this.milesValue=milesValue;

    }

    double getCashValue()
    {
        return cashValue;
    }
    double getMilesValue()
    {
        milesValue=(cashValue*0.0035);
        return milesValue;
    }

}
