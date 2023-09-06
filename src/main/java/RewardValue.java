public class RewardValue {
    
    private double cashValue;
    private double milesValue;
    private final double MILES_CONVERSION_RATE = 0.0035;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * MILES_CONVERSION_RATE;
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / MILES_CONVERSION_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return this.milesValue;
    }
}
