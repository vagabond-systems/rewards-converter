public class RewardValue {
    private double cashValue;
    private int milesValue;
    //RewardValue must convert from miles to cash
    // at a rate of 0.0035.
    private double milesToCashRate = 0.0035;

//Constructor to create RewardValue object using cash value
//converts cash value to miles using the conversion rate
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / milesToCashRate);
    }
//Constructor to create RewardValue object using miles value
//converts miles to cash using the conversion rate
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * milesToCashRate;
    }
    //returns the cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }
    //returns the miles value of
    public int getMilesValue() {
        return milesValue;
    }



}
