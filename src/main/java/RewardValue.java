public class RewardValue {
    double cashvalue,miles;
    RewardValue(double cashValue)
    {
        cashvalue=cashValue;
    }
    RewardValue()
    {
        miles=0.0;
    }

    public double getCashvalue() {
        return cashvalue;
    }

    public double getMilesValue() {
        miles=getCashvalue()*0.0035;
        return miles;
    }
}
