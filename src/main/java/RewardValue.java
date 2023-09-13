public class RewardValue {
    private double MilesValue;
    private double CashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue)
    {
        this.CashValue = cashValue;
        //this.MilesValue = cashValue/0.0035;
    }

    public RewardValue(int milesValue)
    {
        this.MilesValue = milesValue;
        this.CashValue = convertToCash(milesValue);
        //this.CashValue = milesValue*0.0035;
    }

    private static int convertToMile(double cashvalue)
    {
        return (int) (cashvalue/MILES_TO_CASH_CONVERSION_RATE);
    }
    private static double convertToCash(int milesValue)
    {
        return milesValue*MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue()
    {
        return CashValue;
    }
    public double getMilesValue()
    {
        return convertToMile(this.getCashValue());
    }
}
