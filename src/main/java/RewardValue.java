public class RewardValue {

    //  store the cash value
    double cashValue;

    // store the conversion rate from miles to cash
    double conversionRate = 0.0035;

    // constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // constructor that accepts a value in miles
    public RewardValue(int miles) {
        // Convert miles to cash using the conversion rate
        this.cashValue = miles * conversionRate;
    }

    // method to return the cash value of the reward value
    public double getCashValue() {
        return this.cashValue;
    }

    // method to return how many miles the reward value is worth
    public int getMilesValue() {
        // Convert cash to miles using the conversion rate
        return (int) (this.cashValue / conversionRate);
    }
}
