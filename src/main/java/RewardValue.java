public class RewardValue
{
    private double cash;
    private double miles;
    final double rate = 0.0035;

    public RewardValue(int milesValue)
    {
        this.miles = milesValue;
    }

    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public double getCashValue() {

        return cash / rate;
    }

    public double getMilesValue() {
        return miles * rate;
    }
}
