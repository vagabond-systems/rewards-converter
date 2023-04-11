public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double CONVERSION_RATE = 0.0035;
    // Constructor that accepts a cash value and calculates the miles value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) ((int) cashValue / CONVERSION_RATE);
    }
    // Constructor that accepts a miles value and calculates the cash value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }
    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }
    // Method to get the miles value of the RewardValue
    public double getMilesValue() {
        return milesValue;
    }
}

