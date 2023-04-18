public class RewardValue
{
    //private attributes + final variable needed for class
    protected double cashValue;
    protected int mileValue;
    public static final double cashRate = 0.0035;

    //constructor accepts cash value
    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        mileValue = 0;
    }

    //constructor accepts mile value
    public RewardValue (int mileValue)
    {
        this.mileValue = mileValue;
        cashValue = 0;
    }

    //converts miles to cash
    public double getCashValue()
    {
        if(cashValue == 0)
        {
            cashValue = mileValue * cashRate;
        }

        return cashValue;
    }

    //converts cash to miles
    public int getMilesValue()
    {
        if(mileValue == 0)
        {
            mileValue = (int) Math.round(cashValue / cashRate);
        }
        return mileValue;
    }






}
