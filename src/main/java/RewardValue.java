public class RewardValue {
    private double cashValue;
    private int milesValue;
    private double milesToCashRate = 0.0035;

    //RewardValue must convert from miles to cash
    // at a rate of 0.0035.

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue * milesToCashRate);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / milesToCashRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }



}
