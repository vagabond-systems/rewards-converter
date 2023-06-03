public class RewardValue {
    int MilesValue;
    double CashValue;
    static double conversionRate=0.0035;
    RewardValue(double a)
    {
        CashValue=a;
        MilesValue= (int) (CashValue / conversionRate);
    }
    RewardValue(int b)
    {
        MilesValue=b;
        CashValue=MilesValue*conversionRate;
    }
    public double getCashValue()
    {
        return convert_from_miles_to_cash();
    }
    public int getMilesValue()
    {
        return convert_from_cash_to_miles();
    }
    public int convert_from_cash_to_miles()
    {

        return MilesValue;
    }
    public double convert_from_miles_to_cash()
    {
        return CashValue;
    }
}
