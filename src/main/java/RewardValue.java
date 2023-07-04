public class RewardValue {

    private double cashValue;
    private double milesValue;



    public static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    public RewardValue(int milesValue)
    {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue()
    {
        return this.cashValue;
    }

    public double getMilesValue()
    {
        return this.milesValue;
    }
}
