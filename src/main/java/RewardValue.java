
public class RewardValue {

    private double cashValue;
    private int mileValue;
    public static final double rate = 0.0035;
    RewardValue(double value)
    {
        cashValue = value;
    }
    RewardValue(int value)
    {
      mileValue = (int)(value/rate);
    }

    private static int contertToMiles(double value)
    {
        return (int)(value/rate);
    }

    public int getMilesValue() {
        return  contertToMiles(cashValue);
    }
     public double getCashValue() {
        return cashValue;
    }
}
