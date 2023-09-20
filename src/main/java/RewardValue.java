public class RewardValue {
    private double cash;
    private double value;
    public RewardValue(double c)
    {
        cash = c;
    }
    public RewardValue(int m)
    {
        value = m * 0.0035;
    }
    public double getCashValue()
    {
        return value;

    }
    public int getMilesValue()
    {
        return (int)(cash/0.0035);

    }
}
