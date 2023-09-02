public class RewardValue {
    private double cashValue;
    private double milesValue;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }


    public RewardValue(double miles, boolean isMiles) {
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public double getMilesValue()
    {
        return milesValue;
    }
}
