public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double c)
    {
        cash = c;
    }
    public RewardValue(int m)
    {
        miles = m;
    }
    public double getCashValue()
    {
        return miles * 0.0035;

    }
    public int getMilesValue()
    {
        return (int)(cash/0.0035);

    }
}
