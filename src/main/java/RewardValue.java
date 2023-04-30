public class RewardValue {
    private double cash;
    private double miles;
    private static final double RATE = 0.0035;

    RewardValue(double cash)
    {
        this.cash=cash;
        convertToMiles(cash);
    }
    RewardValue(int miles)
    {
        this.miles= miles;
        convertToCash(miles);
    }
    private void convertToCash(int miles)
    {
        this.cash= RATE * ((double) miles);
    }

    private void convertToMiles(double cash)
    {
        this.miles = cash / RATE;
    }
    public double getCashValue()
    {
        return cash;
    }
    public double getMilesValue()
    {
        return miles;
    }
}
