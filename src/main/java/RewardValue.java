public class RewardValue {
    private double cash;
    private int value;
    public RewardValue(double c)
    {
        cash = c;
        value = (int)(c/0.0035);

    }
    public RewardValue(int m)
    {
        value = m;
        cash = m * 0.0035;
    }
    public double getCashValue()
    {
        return cash;
    }
    public int getMilesValue()
    {
        return value;
    }
}
