public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Convert cash to miles at rate 0.0035
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if(isMiles){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash at rate 0.0035

        } else {
            this.cashValue=milesValue;
            this.milesValue=milesValue/0.0035;
        }
    }


    // Get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }
}
