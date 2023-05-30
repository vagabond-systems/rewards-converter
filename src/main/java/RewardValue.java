public class RewardValue
{
    double c;
    int m;


    public RewardValue(double dollar)
    {
        c = dollar;
        m = int(0.0035*c);
    }

    public RewardValue(int mi)
    {
        m = mi;
        c = m/0.0035;
    }

    public double getCashValue()
    {
        return c;
    }

    public int getMilesValue()
    {
        return m;
    }
}
