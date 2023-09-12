public class RewardValue {
    
    private double cashValue;
    private double milesValue;
    public static final double CONVERSION_RATE = 0.0035;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
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
