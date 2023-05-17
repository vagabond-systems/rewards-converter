public class RewardValue {
    private double cashValue, value;
    private double milesValue;
    public static final double miles_to_cash_rate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }
}
